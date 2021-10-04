package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void solve01() {
        SearchInRotatedSortedArray demo = new SearchInRotatedSortedArray();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int expect1 = 4;
        int res1 = demo.solve01(nums1, target1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        int expect2 = -1;
        int res2 = demo.solve01(nums2, target2);
        Assertions.assertEquals(expect2, res2);
    }
}