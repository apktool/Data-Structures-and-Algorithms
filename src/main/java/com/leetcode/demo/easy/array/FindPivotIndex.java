package com.leetcode.demo.easy.array;

/**
 * 给你一个整数数组 nums，请编写一个能够返回数组 “中心下标” 的方法。
 * <p>
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果数组不存在中心下标，返回 -1 。如果数组有多个中心下标，应该返回最靠近左边的那一个。
 * <p>
 * 注意：中心下标可能出现在数组的两端。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-pivot-index
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindPivotIndex {
    /**
     * 暴力求和
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sum(nums, 0, i - 1) == sum(nums, i + 1, nums.length - 1)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 前缀和
     *
     * @param nums
     * @return
     */
    public int solve02(int[] nums) {
        int total = sum(nums, 0, nums.length - 1);
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

    private int sum(int[] nums, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum;
    }
}
