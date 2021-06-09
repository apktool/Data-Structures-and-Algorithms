package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WiggleSubsequenceTest {

    @Test
    public void solve01() {
        WiggleSubsequence demo = new WiggleSubsequence();

        int[] nums1 = {1, 7, 4, 9, 2, 5};
        int expect1 = 6;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int expect2 = 7;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expect3 = 2;
        int res3 = demo.solve01(nums3);
        Assertions.assertEquals(expect3, res3);
    }

    @Test
    public void solve02() {
        WiggleSubsequence demo = new WiggleSubsequence();

        int[] nums1 = {1, 7, 4, 9, 2, 5};
        int expect1 = 6;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        int expect2 = 7;
        int res2 = demo.solve02(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expect3 = 2;
        int res3 = demo.solve02(nums3);
        Assertions.assertEquals(expect3, res3);
    }
}