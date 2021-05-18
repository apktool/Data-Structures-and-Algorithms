package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheMasseuseIcciTest {

    @Test
    public void solve01() {
        TheMasseuseIcci demo = new TheMasseuseIcci();

        int[] nums1 = {1, 2, 3, 1};
        int res1 = demo.solve01(nums1);
        int expect1 = 4;
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {2, 1, 4, 5, 3, 1, 1, 3};
        int res2 = demo.solve01(nums2);
        int expect2 = 12;
        Assertions.assertEquals(expect2, res2);
    }
}