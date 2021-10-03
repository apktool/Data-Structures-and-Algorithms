package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArraysTest {

    @Test
    public void solve01() {
        IntersectionOfTwoArrays demo = new IntersectionOfTwoArrays();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = demo.solve01(nums1, nums2);
        int[] expect = {2};
        Assertions.assertArrayEquals(expect, res);
    }
}