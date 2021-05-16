package com.leetcode.demo.easy.dp;

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TheMaximumSumOfContinuousSubarrays {
    /**
     * 会超时
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        int[] dp = new int[nums.length + 1];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            dp[i + 1] = dp[i] + nums[i];
        }

        for (int i = 0; i < dp.length - 1; i++) {
            for (int j = i + 1; j < dp.length; j++) {
                max = Math.max(max, dp[j] - dp[i]);
            }
        }

        return max;
    }

    public int solve02(int[] nums) {
        //1.dp[i]的意义，dp[i]代表前面i+1个数的和
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 1], 0);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
