package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {

    @Test
    public void solve01() {
        MaximumProductSubarray demo = new MaximumProductSubarray();

        int[] nums1 = {2, 3, -2, 4};
        int res1 = demo.solve01(nums1);
        int expect1 = 6;
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {-2, 0, -1};
        int res2 = demo.solve01(nums2);
        int expect2 = 0;
        Assertions.assertEquals(expect2, res2);
    }
}