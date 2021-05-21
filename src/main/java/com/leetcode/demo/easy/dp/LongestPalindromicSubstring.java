package com.leetcode.demo.easy.dp;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * * 子串(substring): 原始字符串的一个连续子集
 * * 子序列(subsequence): 原始字符串的一个子集
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestPalindromicSubstring {
    /**
     * 动态规划法
     *
     * @param s
     * @return
     */
    public String solve01(String s) {
        if (s.length() < 2) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
        }

        int len = 0;
        int start = 0;

        // dp[i][j] = dp[i + 1][j - 1] && s[i] == s[j]
        for (int j = 1; j < dp.length; j++) {
            for (int i = 0; i < dp.length; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && len < j - i + 1) {
                    start = i;
                    len = j - i + 1;
                }
            }
        }

        return s.substring(start, start + len);
    }

    /**
     * 中心扩展算法
     *
     * @param s
     * @return
     */

    public String solve02(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}

