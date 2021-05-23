package com.leetcode.demo.easy.dp;

public class UniquePathsIi {
    public int solve01(int[][] nums) {
        int[][] dp = new int[nums.length][nums[0].length];

        // 处理第0行第0列
        dp[0][0] = nums[0][0] == 1 ? 0 : 1;

        // 处理第1列
        for (int i = 1, j = 0; i < nums.length; i++) {
            dp[i][j] = (nums[i][j] == 1 || dp[i - 1][j] == 0) ? 0 : 1;
        }

        // 处理第1行
        for (int i = 0, j = 1; j < nums[0].length; j++) {
            dp[i][j] = (nums[i][j] == 1 || dp[i][j - 1] == 0) ? 0 : 1;
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums[i].length; j++) {
                if (nums[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[nums.length - 1][nums[0].length - 1];
    }
}
