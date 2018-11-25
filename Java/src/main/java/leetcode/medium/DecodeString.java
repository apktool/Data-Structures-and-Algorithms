package leetcode.medium;

import java.util.Stack;

/**
 * @author li.wengang
 * @date 2018-11-25 10:23
 * *
 * Given an encoded string, return it's decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 *
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
 * For example, there won't be input like 3a or 2[4].
 *
 * Examples:
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */
public class DecodeString {
    private int pos = 0;

    public String decodeString1(String s) {
        StringBuilder sb = new StringBuilder();
        String num = "";
        for (int i = pos; i < s.length(); i++) {
            if (s.charAt(i) != '[' && s.charAt(i) != ']' && !Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else if (Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
            } else if (s.charAt(i) == '[') {
                pos = i + 1;
                String next = decodeString1(s);
                for (int n = Integer.valueOf(num); n > 0; n--) {
                    sb.append(next);
                }
                num = "";
                i = pos;
            } else if (s.charAt(i) == ']') {
                pos = i;
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public String decodeString2(String s) {
        String res = "";
        int i = 0;
        Stack<Object> stack = new Stack<>();
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = 10 * count + s.charAt(i) - '0';
                    i++;
                }
                stack.push(Integer.valueOf(count));
            } else if (s.charAt(i) == '[') {
                //push previous res value
                stack.push(res);
                res = "";
                i++;
            } else if (s.charAt(i) == ']') {
                //append new res to previous res
                StringBuilder temp = new StringBuilder((String) stack.pop());
                int repeatTimes = (int) stack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(res);
                }
                res = temp.toString();
                i++;
            } else {
                //generate new res
                res += s.charAt(i++);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";

        DecodeString ds = new DecodeString();
        String res;

        res = ds.decodeString1(s);
        System.out.println(res);

        res = ds.decodeString2(s);
        System.out.println(res);
    }
}
