package com.graph;

/**
 * @author apktool
 * @date 2018-06-03 15:22
 * *
 * 使用邻接表创建图
 * * 无向图
 * * 有向图
 */

class Vertex {
    char ch;
    Vertex next;

    public Vertex(char ch) {
        this.ch = ch;
    }

    public void add(char ch) {
        Vertex node = this;
        while (node.next != null) {
            node = node.next;
        }

        node.next = new Vertex(ch);
    }
}

class ListGraph {
    private Vertex[] vertexLists;

    private char[] vertex;
    private char[][] edges;

    public ListGraph(char[] vertex, char[][] edges) {
        this.vertex = vertex;
        this.edges = edges;
    }

    public void buildUndirectedGraph() {
        this.vertexLists = new Vertex[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            vertexLists[i] = new Vertex(vertex[i]);
        }

        for (char[] c : edges) {
            int p1 = getPosition(c[0]);
            vertexLists[p1].add(c[1]);
            int p2 = getPosition(c[1]);
            vertexLists[p2].add(c[0]);
        }
    }

    public void buildDirectedGraph() {
        this.vertexLists = new Vertex[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            vertexLists[i] = new Vertex(vertex[i]);
        }

        for (char[] c : edges) {
            int p = getPosition(c[0]);
            vertexLists[p].add(c[1]);
        }
    }

    private int getPosition(char ch) {
        for (int i = 0; i < vertexLists.length; i++) {
            if (vertexLists[i].ch == ch) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < vertex.length; i++) {
            Vertex temp = vertexLists[i];
            while (temp != null) {
                System.out.printf("%c ", temp.ch);
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class AdjacencyList {
    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
        char[][] edges = new char[][]{
                {'A', 'C'},
                {'A', 'D'},
                {'A', 'F'},
                {'B', 'C'},
                {'C', 'D'},
                {'E', 'G'},
                {'D', 'G'},
                {'I', 'J'},
                {'J', 'G'}};

        ListGraph haha = new ListGraph(vexs, edges);
        haha.buildUndirectedGraph();
        haha.display();

        System.out.println("---------------------");

        haha.buildDirectedGraph();
        haha.display();
    }
}
