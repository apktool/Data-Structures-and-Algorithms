package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayIiTest {

    @Test
    public void solve01() {
        SearchInRotatedSortedArrayIi demo = new SearchInRotatedSortedArrayIi();

        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        boolean res1 = demo.solve01(nums1, target1);
        Assertions.assertTrue(res1);

        int[] nums2 = {1, 2, 1};
        int target2 = 0;
        boolean res2 = demo.solve01(nums2, target2);
        Assertions.assertFalse(res2);

        int[] nums3 = {1, 0, 1, 1, 1};
        int target3 = 0;
        boolean res3 = demo.solve01(nums3, target3);
        Assertions.assertTrue(res3);
    }
}