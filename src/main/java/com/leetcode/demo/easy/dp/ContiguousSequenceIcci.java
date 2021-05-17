package com.leetcode.demo.easy.dp;

/**
 * 给定一个整数数组，找出总和最大的连续数列，并返回总和
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contiguous-sequence-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ContiguousSequenceIcci {
    public int solve01(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int max = nums[0];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
