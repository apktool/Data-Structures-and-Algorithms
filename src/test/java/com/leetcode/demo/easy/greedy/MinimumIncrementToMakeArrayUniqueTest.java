package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumIncrementToMakeArrayUniqueTest {

    @Test
    public void solve01() {
        MinimumIncrementToMakeArrayUnique demo = new MinimumIncrementToMakeArrayUnique();

        int[] nums1 = {3, 2, 1, 2, 1, 7};
        int expect1 = 6;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 2};
        int expect2 = 1;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        MinimumIncrementToMakeArrayUnique demo = new MinimumIncrementToMakeArrayUnique();

        int[] nums1 = {3, 2, 1, 2, 1, 7};
        int expect1 = 6;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 2};
        int expect2 = 1;
        int res2 = demo.solve02(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}