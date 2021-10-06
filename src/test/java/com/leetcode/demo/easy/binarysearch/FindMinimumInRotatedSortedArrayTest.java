package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void solve01() {
        FindMinimumInRotatedSortedArray demo = new FindMinimumInRotatedSortedArray();

        int[] nums1 = {3, 4, 5, 1, 2};
        int expect1 = 1;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int expect2 = 0;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}