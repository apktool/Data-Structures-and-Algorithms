package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
 * 因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fair-candy-swap
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FairCandySwap {
    /**
     * 假设{x, y}是返回的结果
     * sumA - x + y = sumB + x - y
     * 则
     * x = y + (sumA - sumB) / 2
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] solve01(int[] nums1, int[] nums2) {
        Set<Integer> sets = new HashSet<>();

        for (int num : nums1) {
            sets.add(num);
        }

        int[] res = new int[2];

        int delta = (Arrays.stream(nums1).sum() - Arrays.stream(nums2).sum()) / 2;
        for (int num : nums2) {
            int tmp = num + delta;
            if (sets.contains(tmp)) {
                res[0] = tmp;
                res[1] = num;
                break;
            }
        }

        return res;
    }
}
