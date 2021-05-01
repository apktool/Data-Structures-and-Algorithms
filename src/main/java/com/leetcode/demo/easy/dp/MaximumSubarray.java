package com.leetcode.demo.easy.dp;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumSubarray {
    public int solve01(int[] nums) {
        int curMax = nums[0];
        int maxMax = curMax;

        for (int i = 0; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);
            maxMax = Math.max(maxMax, curMax);
        }

        return maxMax;
    }
}
