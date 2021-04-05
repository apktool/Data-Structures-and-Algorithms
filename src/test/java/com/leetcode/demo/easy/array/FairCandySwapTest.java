package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FairCandySwapTest {

    @Test
    public void solve01() {
        FairCandySwap demo = new FairCandySwap();

        int[] nums1 = {1, 1};
        int[] nums2 = {2, 2};

        int[] expect1 = {1, 2};
        int[] res1 = demo.solve01(nums1, nums2);
        Assertions.assertArrayEquals(expect1, res1);
    }
}