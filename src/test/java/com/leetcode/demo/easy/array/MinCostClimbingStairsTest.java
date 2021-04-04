package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTest {

    @Test
    public void solve01() {
        MinCostClimbingStairs demo = new MinCostClimbingStairs();

        int[] nums1 = {10, 15, 20};
        int expect1 = 15;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expect2 = 6;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}