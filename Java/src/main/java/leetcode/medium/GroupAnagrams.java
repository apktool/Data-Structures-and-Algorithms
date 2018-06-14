package leetcode.medium;

import java.util.*;

/**
 * @author apktool
 * @date 2018-06-14 20:59
 * *
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return new ArrayList<List<String>>();
        }

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);

            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagrams haha = new GroupAnagrams();
        List<List<String>> result = haha.groupAnagrams(strs);
        System.out.println(result);

        String a = "Helloworld";

        char[] b = a.toCharArray();
        for(int i = 0; i < b.length / 2; i++) {
            char temp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = temp;
        }

        System.out.println(String.valueOf(b));
    }
}
