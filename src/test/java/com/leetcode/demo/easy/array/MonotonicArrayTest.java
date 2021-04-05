package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonotonicArrayTest {

    @Test
    public void solve01() {
        MonotonicArray demo = new MonotonicArray();

        int[] nums1 = {1, 2, 2, 3};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertEquals(true, res1);

        int[] nums2 = {2, 2, 2, 2};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertEquals(true, res2);
    }
}