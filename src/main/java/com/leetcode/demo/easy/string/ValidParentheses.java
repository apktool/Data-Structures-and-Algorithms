package com.leetcode.demo.easy.string;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParentheses {
    public boolean solve01(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; flag && i < s.length(); i++) {
            char tmp = s.charAt(i);
            if ('(' == tmp) {
                stack.push(')');
            } else if ('[' == tmp) {
                stack.push(']');
            } else if ('{' == tmp) {
                stack.push('}');
            } else {
                flag = !stack.isEmpty() && stack.pop() == tmp;
            }
        }

        return flag && stack.isEmpty();
    }
}
