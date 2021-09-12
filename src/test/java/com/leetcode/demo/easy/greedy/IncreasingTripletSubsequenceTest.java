package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void solve01() {
        IncreasingTripletSubsequence demo = new IncreasingTripletSubsequence();

        int[] nums1 = {1, 2, 3, 4, 5};
        Assertions.assertTrue(demo.solve01(nums1));

        int[] nums2 = {5, 4, 3, 2, 1};
        Assertions.assertFalse(demo.solve01(nums2));

        int[] nums3 = {2, 1, 5, 0, 4, 6};
        Assertions.assertTrue(demo.solve01(nums3));
    }
}