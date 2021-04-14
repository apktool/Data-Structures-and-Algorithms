package com.leetcode.demo.easy.string;

/**
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * <p>
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ransom-note
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NumberOfSegmentsInaString {
    public int solve01(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        return s.split("\\s+").length;
    }

    public int solve02(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                cnt++;
            }
        }

        return cnt;
    }
}
