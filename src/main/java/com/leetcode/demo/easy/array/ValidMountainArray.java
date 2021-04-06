package com.leetcode.demo.easy.array;

/**
 * 给定一个整数数组 arr，如果它是有效的山脉数组就返回 true，否则返回 false。
 * <p>
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 * <p>
 * arr.length >= 3
 * 在 0 < i < arr.length - 1 条件下，存在 i 使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidMountainArray {
    public boolean solve01(int[] nums) {
        int i = 0;

        while (i + 1 < nums.length && nums[i] < nums[i + 1]) {
            i++;
        }

        if (i == 0 || i == nums.length - 1) {
            return false;
        }

        while (i + 1 < nums.length && nums[i] > nums[i + 1]) {
            i++;
        }

        return i == nums.length - 1;
    }

    public boolean solve02(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left + 1 < nums.length && nums[left] < nums[left + 1]) {
            left++;
        }

        while (right > 0 && nums[right - 1] > nums[right]) {
            right--;
        }

        return left > 0 && right < nums.length - 1 && left == right;
    }
}
