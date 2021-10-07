package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySumTest {

    @Test
    public void solve01() {
        MinimumSizeSubarraySum demo = new MinimumSizeSubarraySum();

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int expect1 = 2;
        int res1 = demo.solve01(nums1, target1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target2 = 11;
        int expect2 = 0;
        int res2 = demo.solve01(nums2, target2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        MinimumSizeSubarraySum demo = new MinimumSizeSubarraySum();

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int expect1 = 2;
        int res1 = demo.solve02(nums1, target1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target2 = 11;
        int expect2 = 0;
        int res2 = demo.solve02(nums2, target2);
        Assertions.assertEquals(expect2, res2);
    }
}