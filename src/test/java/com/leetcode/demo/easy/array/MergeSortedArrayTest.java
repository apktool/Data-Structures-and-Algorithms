package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    @Test
    public void solve01() {
        MergeSortedArray demo = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2 = {2, 5, 6};
        int n2 = 3;
        int[] expect1 = {1, 2, 2, 3, 5, 6};
        demo.solve01(nums1, m1, nums2, n2);
        Assertions.assertArrayEquals(expect1, nums1);

        int[] nums3 = {0};
        int m3 = 0;
        int[] nums4 = {1};
        int n4 = 1;
        int[] expect2 = {1};
        demo.solve01(nums3, m3, nums4, n4);
        Assertions.assertArrayEquals(expect2, nums3);
    }
}