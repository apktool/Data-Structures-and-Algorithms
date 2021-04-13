package com.leetcode.demo.easy.string;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 提示：你可以假定该字符串只包含小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class FirstUniqueCharacterInaString {
    public int solve01(String s) {
        int[] caps = new int[26];

        for (int i = 0; i < s.length(); i++) {
            caps[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (caps[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
