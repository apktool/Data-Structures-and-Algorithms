package com.leetcode.demo.easy.array;

/**
 * 给定一个二进制数组， 计算其中最大连续 1 的个数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/max-consecutive-ones
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxConsecutiveOnes {
    public int solve01(int[] nums) {
        int max = 0;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
            }
            max = Math.max(max, current);

            if (num == 0) {
                current = 0;
            }
        }

        return max;
    }

    public int solve02(int[] nums) {
        int i = 0, j = 0;
        int max = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                max = Math.max(max, j - i);
                i = j + 1;
            }
            j++;
        }

        return Math.max(max, j - i);
    }
}
