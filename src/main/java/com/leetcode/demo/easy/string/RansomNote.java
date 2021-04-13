package com.leetcode.demo.easy.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ransom-note
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RansomNote {
    public boolean solve01(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            char tmp = s1.charAt(i);

            if (!map.containsKey(tmp) || map.get(tmp) == 0) {
                return false;
            }

            map.put(tmp, map.get(tmp) - 1);
        }

        return true;
    }

    public boolean solve02(String s1, String s2) {
        if (s1.length() < s1.length()) {
            return false;
        }

        int caps[] = new int[26];
        for (char c : s1.toCharArray()) {
            int index = s2.indexOf(c, caps[c - 'a']);
            if (index == -1) {
                return false;
            }
            caps[c - 97] = index + 1;
        }
        return true;
    }
}
