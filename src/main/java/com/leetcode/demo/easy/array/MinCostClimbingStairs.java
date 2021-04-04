package com.leetcode.demo.easy.array;

/**
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
 * <p>
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * <p>
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-cost-climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class MinCostClimbingStairs {
    /**
     * 动态规划
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = dp[1] = 0;

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.min(dp[i - 1] + nums[i - 1], dp[i - 2] + nums[i - 2]);
        }


        return dp[nums.length];
    }
}
