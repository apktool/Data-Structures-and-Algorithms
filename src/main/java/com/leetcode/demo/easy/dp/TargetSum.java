package com.leetcode.demo.easy.dp;

/**
 * 给你一个整数数组 nums 和一个整数 target 。
 * 向数组中的每个整数前添加'+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 * <p>
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/target-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class TargetSum {
    public int solve01(int[] nums, int target) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (Math.abs(target) > sum || (target + sum) % 2 == 1) {
            return 0;
        }

        int left = (target + sum) / 2;
        int[] dp = new int[left + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = left; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[left];
    }
}
