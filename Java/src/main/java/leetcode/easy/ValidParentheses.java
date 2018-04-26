package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author apktool
 * @date 2018-04-15 20:38
 * *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParentheses {
    public boolean isValid1(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char value = chars[i];
            if (hashMap.get(value) != null) {
                if (!stack.isEmpty() && stack.pop().charValue() == hashMap.get(value)) {
                    continue;
                } else {
                    return false;
                }
            }
            stack.push(Character.valueOf(value));
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public boolean isValid2(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': stack.push(')'); break;
                case '{': stack.push('}'); break;
                case '[': stack.push(']'); break;
                default:
                    if(stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[]}()";

        ValidParentheses validParentheses = new ValidParentheses();
        Boolean result;

        result = validParentheses.isValid1(s);
        System.out.println(result);

        result = validParentheses.isValid2(s);
        System.out.println(result);
    }
}
