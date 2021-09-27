package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HandOfStraightsTest {

    @Test
    public void solve01() {
        HandOfStraights demo = new HandOfStraights();

        int[] nums1 = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int n1 = 3;
        boolean res1 = demo.solve01(nums1, n1);
        Assertions.assertTrue(res1);
    }
}