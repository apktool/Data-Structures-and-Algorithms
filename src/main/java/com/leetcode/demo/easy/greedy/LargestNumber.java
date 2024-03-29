package com.leetcode.demo.easy.greedy;

import java.util.PriorityQueue;

/**
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LargestNumber {
    public String solve01(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>((x, y) -> (y + x).compareTo(x + y));
        for (int num : nums) {
            queue.offer(String.valueOf(num));
        }

        StringBuilder builder = new StringBuilder();
        while (queue.size() > 0) {
            builder.append(queue.poll());
        }

        String res = builder.toString();
        return res.charAt(0) == '0' ? "0" : res;
    }
}
