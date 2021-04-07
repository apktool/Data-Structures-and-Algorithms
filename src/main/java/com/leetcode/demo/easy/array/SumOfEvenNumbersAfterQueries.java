package com.leetcode.demo.easy.array;

import java.util.Arrays;

/**
 * 给出一个整数数组 A 和一个查询数组 queries。
 * 对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
 * （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
 * 返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-even-numbers-after-queries
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumOfEvenNumbersAfterQueries {
    /**
     * 会超时
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] solve01(int[] nums1, int[][] nums2) {
        int index = 0;
        int[] res = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            nums1[nums2[i][1]] = nums1[nums2[i][1]] + nums2[i][0];
            res[index++] = calc(nums1);
        }

        return res;
    }

    private int calc(int[] nums) {
        return Arrays.stream(nums).filter(t -> t % 2 == 0).sum();
    }

    public int[] solve02(int[] nums1, int[][] nums2) {
        int sum = Arrays.stream(nums1).filter(t -> t % 2 == 0).sum();
        int[] res = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            int value = nums2[i][0];
            int index = nums2[i][1];

            if (nums1[index] % 2 == 0) {
                sum -= nums1[index];
            }

            nums1[index] += value;

            if (nums1[index] % 2 == 0) {
                sum += nums1[index];
            }

            res[i] = sum;
        }

        return res;
    }

    public int[] solve03(int[] nums1, int[][] nums2) {
        int sum = Arrays.stream(nums1).filter(t -> t % 2 == 0).sum();
        int[] res = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            int value = nums2[i][0];
            int index = nums2[i][1];

            sum -= nums1[index] * (nums1[index] & 1 ^ 1);
            nums1[index] += value;
            sum += nums1[index] * (nums1[index] & 1 ^ 1);

            res[i] = sum;
        }

        return res;
    }
}
