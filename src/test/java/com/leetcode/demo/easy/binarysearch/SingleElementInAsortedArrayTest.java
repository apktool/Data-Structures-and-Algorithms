package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleElementInAsortedArrayTest {

    @Test
    public void solve01() {
        SingleElementInAsortedArray demo = new SingleElementInAsortedArray();

        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int expect1 = 2;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        int expect2 = 10;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {1};
        int expect3 = 1;
        int res3 = demo.solve01(nums3);
        Assertions.assertEquals(expect3, res3);
    }
}