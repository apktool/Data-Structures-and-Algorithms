package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HindexIiTest {

    @Test
    public void solve01() {
        HindexIi demo = new HindexIi();

        int[] nums1 = {0, 1, 3, 5, 6};
        int expect1 = 3;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 100};
        int expect2 = 2;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}