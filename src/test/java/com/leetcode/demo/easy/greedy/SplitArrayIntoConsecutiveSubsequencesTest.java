package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitArrayIntoConsecutiveSubsequencesTest {

    @Test
    public void solve01() {
        SplitArrayIntoConsecutiveSubsequences demo = new SplitArrayIntoConsecutiveSubsequences();

        int[] nums1 = {1, 2, 3, 3, 4, 5};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertTrue(res1);

        int[] nums2 = {1, 2, 3, 4, 4, 5};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertFalse(res2);
    }
}