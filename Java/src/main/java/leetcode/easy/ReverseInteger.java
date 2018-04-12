package leetcode.easy;

import java.util.*;

/**
 * @author acronymor
 * @date 2018-04-11 21:39
 *
 * *
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: 123
 * Output: 321
 *
 * Example 2:
 * Input: -123
 * Output: -321
 *
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public int reverse1(int x) {

        if(x > Integer.MAX_VALUE) {
            return 0;
        }

        List<String> list = Arrays.asList(String.valueOf(x).split(""));
        Collections.reverse(list);

        String temp = "";

        for(String i: list) {
            if(!i.equals("-")) {
                temp += i;
            } else {
                temp = "-".concat(temp);
            }
        }
        int result = 0;
        try{
            result = Integer.valueOf(temp);
        }catch(NumberFormatException ex) {}

        if(result > Integer.MAX_VALUE) {
            return 0;
        }

        return result;
    }

    public int reverse2(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if (result != (newResult - tail) / 10) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        int x = -36469;

        int result;

        result = reverseInteger.reverse1(x);
        System.out.println(result);

        System.out.println("----------");

        result = reverseInteger.reverse2(x);
        System.out.println(result);
    }
}
