package com.leetcode.demo.easy.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 * 回文串 是正着读和反着读都一样的字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-partitioning
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindromePartitioning {
    public List<List<String>> solve01(String s) {
        if (s.length() < 2) {
            return List.of(List.of(s));
        }

        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < dp.length; ++i) {
            Arrays.fill(dp[i], true);
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
            }
        }

        dfs(dp, new ArrayList<>(), s, 0);

        return ret;
    }

    List<List<String>> ret = new ArrayList<>();

    public void dfs(final boolean[][] dp, List<String> ans, String s, int i) {
        if (i == s.length()) {
            ret.add(new ArrayList<>(ans));
        }

        for (int j = i; j < s.length(); j++) {
            if (dp[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(dp, ans, s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
