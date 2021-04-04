package com.leetcode.demo.easy.array;

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * <p>
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * <p>
 * 如果是，则返回最大元素的索引，否则返回-1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LargestNumberAtLeastTwiceOfOthers {
    /**
     * 找出最大+次大值
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int max = 0;
        int subMax = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                subMax = max;
                max = nums[i];
                index = i;
            } else {
                subMax = Math.max(subMax, nums[i]);
            }
        }
        return max >= subMax * 2 ? index : -1;
    }

    /**
     * 标记+判断
     *
     * @param nums
     * @return
     */
    public int solve02(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxIndex != i && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
