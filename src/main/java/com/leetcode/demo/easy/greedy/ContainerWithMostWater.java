package com.leetcode.demo.easy.greedy;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点i,ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ContainerWithMostWater {
    public int solve01(int[] nums) {
        int i = 0, j = nums.length - 1;
        int res = Integer.MIN_VALUE;
        while (i < j) {
            res = Math.max(res, Math.min(nums[i], nums[j]) * (j - i));
            if (nums[i] <= nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
