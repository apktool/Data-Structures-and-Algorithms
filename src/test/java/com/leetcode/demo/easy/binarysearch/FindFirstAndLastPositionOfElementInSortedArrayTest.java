package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void solve01() {
        FindFirstAndLastPositionOfElementInSortedArray demo = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] expect1 = {3, 4};
        int[] res1 = demo.solve01(nums1, target1);
        Assertions.assertArrayEquals(expect1, res1);

        int[] nums2 = {2, 2};
        int target2 = 3;
        int[] expect2 = {-1, -1};
        int[] res2 = demo.solve01(nums2, target2);
        Assertions.assertArrayEquals(expect2, res2);
    }
}