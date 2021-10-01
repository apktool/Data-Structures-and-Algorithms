package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoatsToSavePeopleTest {

    @Test
    public void solve01() {
        BoatsToSavePeople demo = new BoatsToSavePeople();

        int[] nums1 = {3, 2, 2, 1};
        int limit1 = 3;
        int expect1 = 3;
        int res1 = demo.solve01(nums1, limit1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {3, 5, 3, 4};
        int limit2 = 5;
        int expect2 = 4;
        int res2 = demo.solve01(nums2, limit2);
        Assertions.assertEquals(expect2, res2);
    }
}