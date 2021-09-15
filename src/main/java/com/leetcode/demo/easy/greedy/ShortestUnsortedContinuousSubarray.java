package com.leetcode.demo.easy.greedy;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ShortestUnsortedContinuousSubarray {
    public int solve01(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);

        int i = 0, j = nums.length - 1;
        while (i < nums.length && nums[i] == clone[i]) i++;
        while (j > i && nums[j] == clone[j]) j--;
        return j - i + 1;
    }
}
