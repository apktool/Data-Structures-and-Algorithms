package com.leetcode.demo.easy.array;

import java.util.Arrays;

public class MissingNumber {
    /**
     * 会超时
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        Arrays.sort(nums);

        int j = 0;

        while (j < nums.length) {
            if (j + 1 == nums.length) {
                return nums[j];
            }

            if (nums[j] + 1 != nums[j + 1]) {
                return nums[j] + 1;
            }
        }

        return nums[j];
    }

    /**
     * 位运算
     * 由于异或运算（XOR）满足结合律，并且对一个数进行两次完全相同的异或运算会得到原来的数，因此我们可以通过异或运算找到缺失的数字
     *
     * @param nums
     * @return
     */
    public int solve02(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    /**
     * 数学方法
     * 可以用 高斯求和公式 求出 [0..n] 的和，减去数组中所有数的和，就得到了缺失的数字。
     *
     * @param nums
     * @return
     */
    public int solve03(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    /**
     * 数学方法
     * 只需要遍历一遍数组，在把0-n这n个自然数全加起来的同时也减去nums[i]，这样不但效率高，也防止了数据溢出
     *
     * @param nums
     * @return
     */
    public int solve04(int[] nums) {
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum += i;
            sum -= nums[i - 1];
        }
        return sum;
    }
}
