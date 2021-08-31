package com.leetcode.demo.easy.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TargetSumTest {

    @Test
    public void solve01() {
        TargetSum demo = new TargetSum();

        int[] nums1 = {1, 1, 1, 1, 1};
        int target1 = 3;
        int expect1 = 5;

        int res1 = demo.solve01(nums1, target1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1};
        int target2 = 1;
        int expect2 = 1;

        int res2 = demo.solve01(nums2, target2);
        Assertions.assertEquals(expect2, res2);
    }
}