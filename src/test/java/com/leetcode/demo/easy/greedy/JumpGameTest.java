package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {

    @Test
    public void solve01() {
        JumpGame demo = new JumpGame();

        int[] nums1 = {2, 3, 1, 1, 4};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertTrue(res1);

        int[] nums2 = {3, 2, 1, 0, 4};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertFalse(res2);
    }
}