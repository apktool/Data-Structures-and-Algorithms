package com.leetcode.demo.easy.string;

/**
 * 给定一个字符串s，计算具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串中的所有 0 和所有 1 都是连续的。
 * 重复出现的子串要计算它们出现的次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-binary-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CountBinarySubstrings {
    public int solve01(String s) {
        int i = 0, last = 0, ans = 0;
        while (i < s.length()) {
            char tmp = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == tmp) {
                ++i;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }

    public int solve02(String s) {
        int preLen = 0, curLen = 1, count = 0;
        char[] array = s.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                curLen++;
            } else {
                preLen = curLen;
                curLen = 1;
            }

            if (preLen >= curLen) {
                count++;
            }
        }
        return count;
    }
}