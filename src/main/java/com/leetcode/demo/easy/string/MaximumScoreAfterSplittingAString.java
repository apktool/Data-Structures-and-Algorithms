package com.leetcode.demo.easy.string;

/**
 * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即左 子字符串和 右 子字符串）所能获得的最大得分。
 * <p>
 * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-score-after-splitting-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumScoreAfterSplittingAString {
    public int solve01(String s) {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < s.length(); i++) {
            int left = 0, right = 0;
            for (char item : s.substring(0, i).toCharArray()) {
                if (item == '0') {
                    left++;
                }
            }

            for (char item : s.substring(i).toCharArray()) {
                if (item == '1') {
                    right++;
                }
            }

            max = Math.max(max, left + right);
        }

        return max;
    }

    public int solve02(String s) {
        int res = 0, cnt1 = 0, cnt0 = 0;

        for (int i = 0; i < s.length(); i++) {
            cnt1 += s.charAt(i) - '0';
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                cnt0++;
            } else {
                cnt1--;
            }

            res = Math.max(res, cnt0 + cnt1);
        }

        return res;
    }
}