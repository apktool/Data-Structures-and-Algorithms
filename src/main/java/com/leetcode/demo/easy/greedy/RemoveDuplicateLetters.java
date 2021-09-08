package com.leetcode.demo.easy.greedy;

import java.util.Stack;

/**
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-letters/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class RemoveDuplicateLetters {
    public String solve01(String s) {
        boolean[] visited = new boolean[26];
        int[] nums = new int[26];

        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!visited[ch - 'a']) {
                while (builder.length() > 0 && builder.charAt(builder.length() - 1) > ch) {
                    if (nums[builder.charAt(builder.length() - 1) - 'a'] > 0) {
                        visited[builder.charAt(builder.length() - 1) - 'a'] = false;
                        builder.deleteCharAt(builder.length() - 1);
                    } else {
                        break;
                    }
                }
                visited[ch - 'a'] = true;
                builder.append(ch);
            }
            nums[ch - 'a'] -= 1;
        }

        return builder.toString();
    }

    public String solve02(String s) {
        boolean[] visited = new boolean[26];
        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (visited[ch - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > ch && lastIndex[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.reverse().toString();
    }
}