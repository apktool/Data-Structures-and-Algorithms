package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    @Test
    public void solve01() {
        MaximumSubarray demo = new MaximumSubarray();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expect1 = 6;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        MaximumSubarray demo = new MaximumSubarray();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expect1 = 6;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}