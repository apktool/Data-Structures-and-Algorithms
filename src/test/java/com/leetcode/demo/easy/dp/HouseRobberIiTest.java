package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberIiTest {

    @Test
    public void solve01() {
        HouseRobberIi demo = new HouseRobberIi();

        int[] nums1 = {2, 3, 2};
        int expect1 = 3;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 3, 1};
        int expect2 = 4;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {1, 2, 1, 1};
        int expect3 = 3;
        int res3 = demo.solve01(nums3);
        Assertions.assertEquals(expect3, res3);
    }
}