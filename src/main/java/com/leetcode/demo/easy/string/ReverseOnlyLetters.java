package com.leetcode.demo.easy.string;

import java.util.Stack;

/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-only-letters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseOnlyLetters {
    public String solve01(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < j && !Character.isLetter(chars[i])) {
                i++;
            }

            while (i < j && !Character.isLetter(chars[j])) {
                j--;
            }

            if (i < j) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    public String solve02(String s) {
        Stack<Character> letters = new Stack();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            char tmp = Character.isLetter(c) ? letters.pop() : c;
            ans.append(tmp);
        }

        return ans.toString();
    }
}