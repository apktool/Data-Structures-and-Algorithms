package com.leetcode.demo.easy.dp;

import java.util.List;

/**
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * 也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Triangle {
    public int solve01(List<List<Integer>> triangle) {
        int len = triangle.get(triangle.size() - 1).size();
        int[][] dp = new int[len][len];

        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
                }
            }
        }

        int min = dp[len - 1][0];
        for (int j = 0; j < dp[len - 1].length; j++) {
            if (dp[len - 1][j] < min) {
                min = dp[len - 1][j];
            }
        }

        return min;
    }

    public int solve02(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
