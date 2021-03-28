package com.leetcode.demo.easy.array;

public class TwoSum2InputArrayIsSorted {
    /**
     * 双指针
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] solve01(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int sum = nums[low] + nums[high];

            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }

        return new int[]{-1, -1};
    }
}
