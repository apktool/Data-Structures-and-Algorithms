package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。
 * <p>
 * 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/degree-of-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DegreeOfAnArray {
    /**
     * 哈希表
     * <p>
     * 数组中的三个元素分别代表这个数出现的次数、这个数在原数组中第一次出现的位置和这个数在原数组中最后一次出现的位置
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }
        int maxNum = 0, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            }
            // 出现了两个频度一样的数
            if (maxNum == arr[0]) {
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return minLen;
    }


    /**
     * 滑动窗口
     *
     * @param nums
     * @return
     */
    public int solve02(int[] nums) {
        /*
        nums.length 在1到 50,000 区间范围内。
        nums[i] 是一个在 0 到 49,999 范围内的整数。
         */
        //记录频数
        int[] freq = new int[50000];
        // 记录数组度
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            degree = Math.max(++freq[nums[i]], degree);
        }

        Arrays.fill(freq, 0);
        int left = 0, right = 0, minSpan = Integer.MAX_VALUE;//窗口边界和最小跨度
        while (right < nums.length) {
            // 右窗口划进一个数，其频数加一
            freq[nums[right]]++;
            // 如果其频数等于度
            while (left <= right && degree == freq[nums[right]]) {
                // 记录最小窗口大小
                minSpan = Math.min(minSpan, right - left + 1);
                // 收缩左窗口
                freq[nums[left++]]--;
            }
            // 扩大右窗口
            ++right;
        }
        return minSpan;
    }
}
