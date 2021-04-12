package com.leetcode.demo.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseVowelsOfaString {
    public String solve01(String s) {
        Set<Character> sets = new HashSet<>();
        sets.add('a');
        sets.add('A');
        sets.add('e');
        sets.add('E');
        sets.add('i');
        sets.add('I');
        sets.add('o');
        sets.add('O');
        sets.add('u');
        sets.add('U');

        char[] str = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!sets.contains(str[left])) {
                left++;
                continue;
            }

            if (!sets.contains(str[right])) {
                right--;
                continue;
            }

            char tmp = str[left];
            str[left] = str[right];
            str[right] = tmp;

            left++;
            right--;
        }

        return new String(str);
    }
}
