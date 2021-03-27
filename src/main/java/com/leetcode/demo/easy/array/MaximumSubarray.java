package com.leetcode.demo.easy.array;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * NOTE:
 * 这里感觉贪心和动态规划没有什么太大的却别，只是贪心不改数组本身，但是动态规划改变了数组本身
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class MaximumSubarray {
    /**
     * 贪心
     * 当前指针所指元素之前数列的和小于当前元素，则丢弃当前元素之前的数列
     * <p>
     * param nums
     *
     * @return
     */
    public int solve01(int[] nums) {
        int curSum = nums[0];
        int maxSum = curSum;

        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }

    /**
     * 动态规划
     * <p>
     * f(i)=max{f(i−1)+nums[i],nums[i]}
     * 注意：会修改数组本身的值
     *
     * @param nums
     * @return
     */
    public int solve02(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
        }

        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(maxSum, nums[i]);
        }

        return maxSum;
    }
}