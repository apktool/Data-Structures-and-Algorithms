package com.leetcode.demo.easy.binarysearch;

import java.util.Arrays;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinimumSizeSubarraySum {
    public int solve01(int[] nums, int target) {
        int[] array = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            array[i] = array[i - 1] + nums[i - 1];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= nums.length; i++) {
            int tmp = array[i - 1] + target;
            int bound = Arrays.binarySearch(array, tmp);

            if (bound < 0) {
                bound = -bound - 1;
            }

            if (bound <= nums.length) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public int solve02(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;

        int sum = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum - nums[i] >= target) {
                sum -= nums[i++];
            }

            if (sum >= target) {
                ans = Math.min(ans, j - i + 1);
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
