package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {
    @Test
    public void solve01() {
        CanPlaceFlowers demo = new CanPlaceFlowers();

        int[] nums1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        boolean expect1 = true;
        boolean res1 = demo.solve01(nums1, n1);
        Assertions.assertEquals(expect1, res1);
    }
}