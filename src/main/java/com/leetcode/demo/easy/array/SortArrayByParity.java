package com.leetcode.demo.easy.array;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortArrayByParity {
    public int[] solve01(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }

            if (nums[i] % 2 == 0) {
                i++;
            }

            if (nums[j] % 2 != 0) {
                j--;
            }
        }

        return nums;
    }
}
