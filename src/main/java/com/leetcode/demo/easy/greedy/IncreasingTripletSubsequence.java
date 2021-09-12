package com.leetcode.demo.easy.greedy;

/**
 * 给你一个整数数组nums ，判断这个数组中是否存在长度为 3 的递增子序列。
 * 如果存在这样的三元组下标 (i, j, k)且满足 i < j < k ，使得nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-triplet-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IncreasingTripletSubsequence {
    public boolean solve01(int[] nums) {
        int one = Integer.MAX_VALUE, two = Integer.MAX_VALUE;

        for (int three : nums) {
            if (three <= one) {
                one = three;
            } else if (three <= two) {
                two = three;
            } else {
                return true;
            }
        }

        return false;
    }
}
