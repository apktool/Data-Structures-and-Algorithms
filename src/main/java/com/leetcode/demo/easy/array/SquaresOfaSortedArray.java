package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SquaresOfaSortedArray {
    public int[] solve01(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(nums.length);

        for (int num : nums) {
            queue.offer(num * num);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.poll();
        }

        return nums;
    }

    public int[] solve02(int[] nums) {
        return Arrays.stream(nums).map(t -> t * t).sorted().toArray();
    }

    public int[] solve03(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int i = nums.length - 1;
        int[] res = new int[nums.length];

        while (i >= 0) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i--] = nums[left] * nums[left];
                left++;
            } else {
                res[i--] = nums[right] * nums[right];
                right--;
            }
        }

        return res;
    }
}
