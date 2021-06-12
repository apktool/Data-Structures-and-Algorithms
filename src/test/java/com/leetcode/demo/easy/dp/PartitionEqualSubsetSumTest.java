package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionEqualSubsetSumTest {

    @Test
    public void solve01() {
        PartitionEqualSubsetSum demo = new PartitionEqualSubsetSum();

        int[] nums1 = {1, 5, 11, 5};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertTrue(res1);

        int[] nums2 = {1, 2, 3, 5};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertFalse(res2);
    }
}