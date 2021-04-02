package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayITest {
    @Test
    public void solve01() {
        MaximumAverageSubarrayI demo = new MaximumAverageSubarrayI();

        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        double expect1 = 12.75;
        double res1 = demo.solve01(nums1, k1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {0, 1, 1, 3, 3};
        int k2 = 4;
        double expect2 = 2.0;
        double res2 = demo.solve01(nums2, k2);
        Assertions.assertEquals(expect2, res2);
    }
}