package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PredictTheWinnerTest {

    @Test
    public void solve01() {
        PredictTheWinner demo = new PredictTheWinner();

        int[] nums1 = {1, 5, 2};
        boolean expect1 = demo.solve01(nums1);
        Assertions.assertFalse(expect1);

        int[] nums2 = {1, 5, 233, 7};
        boolean expect2 = demo.solve01(nums2);
        Assertions.assertTrue(expect2);
    }
}