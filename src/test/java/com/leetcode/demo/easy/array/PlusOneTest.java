package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

    @Test
    public void solve01() {
        PlusOne demo = new PlusOne();

        int[] nums1 = {1, 2, 3};
        int[] expect1 = {1, 2, 4};
        int[] res1 = demo.solve01(nums1);
        Assertions.assertArrayEquals(expect1, res1);

        int[] nums2 = {9};
        int[] expect2 = {1, 0};
        int[] res2 = demo.solve01(nums2);
        Assertions.assertArrayEquals(expect2, res2);

        int[] nums3 = {8, 9, 9, 9};
        int[] expect3 = {9, 0, 0, 0};
        int[] res3 = demo.solve01(nums3);
        Assertions.assertArrayEquals(expect3, res3);
    }
}