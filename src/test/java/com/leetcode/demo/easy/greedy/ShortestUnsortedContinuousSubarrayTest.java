package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void solve01() {
        ShortestUnsortedContinuousSubarray demo = new ShortestUnsortedContinuousSubarray();

        int[] nums1 = {2, 6, 4, 8, 10, 9, 15};
        int res1 = demo.solve01(nums1);
        int expect1 = 5;
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 3, 4};
        int res2 = demo.solve01(nums2);
        int expect2 = 0;
        Assertions.assertEquals(expect2, res2);
    }
}