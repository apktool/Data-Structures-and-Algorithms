package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void solve01() {
        LongestIncreasingSubsequence demo = new LongestIncreasingSubsequence();

        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int expect1 = 4;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int expect2 = 4;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}