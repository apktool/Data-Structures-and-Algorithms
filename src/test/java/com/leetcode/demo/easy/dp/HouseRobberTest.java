package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {

    @Test
    public void solve01() {
        HouseRobber demo = new HouseRobber();

        int[] nums1 = {1, 2, 3, 1};
        int expect1 = 4;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {2, 7, 9, 3, 1};
        int expect2 = 12;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}