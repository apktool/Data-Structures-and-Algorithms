package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumLengthOfRepeatedSubarrayTest {

    @Test
    public void solve01() {
        MaximumLengthOfRepeatedSubarray demo = new MaximumLengthOfRepeatedSubarray();

        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        int expect = 3;
        int res = demo.solve01(nums1, nums2);
        Assertions.assertEquals(expect, res);
    }
}