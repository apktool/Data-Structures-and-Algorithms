package com.leetcode.demo.easy.array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ThirdMaximumNumber {
    /**
     * 大根堆
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(nums.length, Comparator.reverseOrder());

        for (int num : nums) {
            if (!queue.contains(num)) {
                queue.offer(num);
            }
        }

        if (queue.size() < 3) {
            return queue.poll();
        } else {
            queue.poll();
            queue.poll();
            return queue.poll();
        }
    }
}
