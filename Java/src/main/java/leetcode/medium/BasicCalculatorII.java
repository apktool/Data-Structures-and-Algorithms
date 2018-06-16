package leetcode.medium;

import java.util.Stack;

/**
 * @author apktool
 * @date 2018-06-16 20:50
 * *
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate toward zero.
 *
 * Example 1:
 *
 * Input: "3+2*2"
 * Output: 7
 *
 * Example 2:
 *
 * Input: " 3/2 "
 * Output: 1
 *
 * Example 3:
 *
 * Input: " 3+5 / 2 "
 * Output: 5
 */
public class BasicCalculatorII {
    public int calculate(String s) {
        int len = s.length();
        if (s == null || len == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if ((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i)) || i == len - 1) {
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int re = 0;
        for (int i : stack) {
            re += i;
        }
        return re;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        int result;

        BasicCalculatorII haha = new BasicCalculatorII();
        result = haha.calculate(s);
        System.out.println(result);
    }
}
