package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void solve01() {
        RemoveDuplicatesFromSortedArray demo = new RemoveDuplicatesFromSortedArray();
        int[] nums1 = {1, 1, 2};
        int expect1 = 2;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expect2 = 5;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}