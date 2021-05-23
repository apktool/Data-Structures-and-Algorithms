package com.leetcode.demo.easy.dp;

/**
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinimumPathSum {
    public int solve01(int[][] nums) {
        int[][] dp = new int[nums.length][nums[0].length];

        // 处理第0行第0列
        dp[0][0] = nums[0][0];

        // 处理第1列
        for (int i = 1, j = 0; i < nums.length; i++) {
            dp[i][j] = dp[i - 1][j] + nums[i][j];
        }

        // 处理第1行
        for (int i = 0, j = 1; j < nums[0].length; j++) {
            dp[i][j] = dp[i][j - 1] + nums[i][j];
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < nums[i].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + nums[i][j];
            }
        }

        return dp[nums.length - 1][nums[0].length - 1];
    }
}
