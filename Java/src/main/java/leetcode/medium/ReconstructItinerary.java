package leetcode.medium;

import java.util.*;

/**
 * @author li.wengang
 * @date 2018-11-13 23:47
 * *
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to],
 * reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus,
 * the itinerary must begin with JFK.
 *
 * Note:
 *
 * If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical
 * order when read as a single string.
 * For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
 * All airports are represented by three capital letters (IATA code).
 * You may assume all tickets form at least one valid itinerary.
 *
 * Example 1:
 * Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
 * Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
 *
 * Example 2:
 * Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 * Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
 * Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
 *              But it is larger in lexical order.
 */
public class ReconstructItinerary {
    private HashMap<String, List<String>> adjList = new HashMap<>();
    private LinkedList<String> route = new LinkedList<>();
    private int numTickets = 0;
    private int numTicketsUsed = 0;

    public List<String> findItinerary1(String[][] tickets) {
        if (tickets == null || tickets.length == 0) {
            return route;
        }
        // build graph
        numTickets = tickets.length;
        for (int i = 0; i < tickets.length; ++i) {
            if (!adjList.containsKey(tickets[i][0])) {
                // create a new list
                List<String> list = new ArrayList<>();
                list.add(tickets[i][1]);
                adjList.put(tickets[i][0], list);
            } else {
                // add to existing list
                adjList.get(tickets[i][0]).add(tickets[i][1]);
            }
        }
        // sort vertices in the adjacency list so they appear in lexical order
        for (Map.Entry<String, List<String>> entry : adjList.entrySet()) {
            Collections.sort(entry.getValue());
        }

        // start DFS
        route.add("JFK");
        dfs1("JFK");
        return route;
    }

    private void dfs1(String v) {
        // base case: vertex v is not in adjacency list
        // v is not a starting point in any itinerary, or we would have stored it
        // thus we have reached end point in our DFS
        if (!adjList.containsKey(v)) {
            return;
        }
        List<String> list = adjList.get(v);
        for (int i = 0; i < list.size(); ++i) {
            String neighbor = list.get(i);
            // remove ticket(route) from graph
            list.remove(i);
            route.add(neighbor);
            numTicketsUsed++;
            dfs1(neighbor);
            // we only return when we have used all tickets
            if (numTickets == numTicketsUsed) {
                return;
            }
            // otherwise we need to revert the changes and try other tickets
            list.add(i, neighbor);
            // we must remove the last airport, since in an itinerary, the same airport can appear many times!!
            route.removeLast();
            numTicketsUsed--;
        }
    }

    // ------------------------------------------

    public List<String> findItinerary2(String[][] tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (String[] t : tickets) {
            PriorityQueue<String> q = map.get(t[0]);
            if (q != null) {
                q.offer(t[1]);
            } else {
                q = new PriorityQueue<>();
                q.offer(t[1]);
                map.put(t[0], q);
            }
        }
        LinkedList<String> list = new LinkedList<>();
        dfs2("JFK", map, list);
        return list;
    }

    private void dfs2(String des, Map<String, PriorityQueue<String>> map, LinkedList<String> list) {
        PriorityQueue<String> q = map.get(des);
        while (q != null && !q.isEmpty()) {
            dfs2(q.poll(), map, list);
        }
        list.addFirst(des);
    }

    public static void main(String[] args) {
        String[][] tickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
//        String[][] tickets = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}

        ReconstructItinerary ri = new ReconstructItinerary();
        List<String> list1 = ri.findItinerary1(tickets);
        System.out.println(list1);

        List<String> list2 = ri.findItinerary2(tickets);
        System.out.println(list2);
    }
}
