package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void solve01() {
        ContainerWithMostWater demo = new ContainerWithMostWater();

        int[] nums1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(49, res1);

        int[] nums2 = {4, 3, 2, 1, 4};
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(16, res2);
    }
}