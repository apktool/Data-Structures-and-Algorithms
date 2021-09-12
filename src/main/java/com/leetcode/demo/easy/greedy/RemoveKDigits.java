package com.leetcode.demo.easy.greedy;

import java.util.Stack;

/**
 * 给你一个以字符串表示的非负整数 num 和一个整数 k ，移除这个数中的 k 位数字，使得剩下的数字最小。请你以字符串形式返回这个最小的数字。
 * *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-k-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class RemoveKDigits {
    public String solve01(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char ch : num.toCharArray()) {
            while (k != 0 && !stack.isEmpty() && stack.peek() > ch) {
                stack.pop();
                k--;
            }

            if (ch != '0' || !stack.isEmpty()) {
                stack.push(ch);
            }
        }

        while (k != 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.length() == 0 ? "0" : builder.reverse().toString();
    }
}
