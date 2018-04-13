package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author acronymor
 * @date 2018-04-12 21:28
 * **
 * BASIC Character: I  V   X   L    C    D     M
 * Arabic numerals: 1  5  10  50  100  500  1000
 * 1、重复数次：一个罗马数字重复几次，就表示这个数的几倍。
 * 2、右加左减（小的在右边，则加法；小的在左边，则减法）：
 *   2.1 在较大的罗马数字的右边记上较小的罗马数字，表示大数字加小数字。
 *     2.1.1 右加数字不可连续超过三位，比如14写成XIV，而非XIIII。
 *
 *   2.2 在较大的罗马数字的左边记上较小的罗马数字，表示大数字减小数字。
 *     2.2.1 左减的数字有限制，仅限于I、X、C。比如45不可以写成VL，只能是XLV
 *     2.2.2 但是，左减时不可跨越一个位数(即I,X,C不能越位相减)。
 *           比如，99不可以用IC（100 - 1）表示，而是用XCIX（[100 - 10] + [10 - 1]）表示。（等同于阿拉伯数字每位数字分别表示。）
 *     2.2.3 左减数字必须为一位，比如8写成VIII，而非IIX。
 */

public class RomanToInteger {
    public int romanToInt1(String s) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        List<String> list = Arrays.asList(s.split(""));

        if (list.size() == 1) {
            return hashMap.get(list.get(0));
        }

        int number = 0;
        int length = list.size();

        for (int i = 0; i < length - 1; i = i + 2) {
            int item1 = hashMap.get(list.get(i));
            int item2 = hashMap.get(list.get(i + 1));
            if (item1 < item2) {
                number += (item2 - item1);
            } else {
                number += (item2 + item1);
            }
        }

       return number;
    }

    public int romanToInt2(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "MCMXCVI";
        int result;

        RomanToInteger romanToInteger = new RomanToInteger();

        // 个人解决办法有误，考虑不周到
        result = romanToInteger.romanToInt1(s);
        System.out.println(result);

        result = romanToInteger.romanToInt2(s);
        System.out.println(result);
    }
}
