package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonDecreasingArrayTest {
    @Test
    public void solve01() {
        NonDecreasingArray demo = new NonDecreasingArray();

        int[] nums1 = {4, 2, 3};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertEquals(true, res1);

        int[] nums2 = {3, 4, 2, 3};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertEquals(false, res2);
    }
}