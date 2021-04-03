package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void solve01() {
        LongestContinuousIncreasingSubsequence demo = new LongestContinuousIncreasingSubsequence();

        int[] nums1 = {1, 3, 5, 4, 7};
        int expect1 = 3;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 3, 5, 7};
        int expect2 = 4;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {2, 2, 2, 2};
        int expect3 = 1;
        int res3 = demo.solve01(nums3);
        Assertions.assertEquals(expect3, res3);
    }
}