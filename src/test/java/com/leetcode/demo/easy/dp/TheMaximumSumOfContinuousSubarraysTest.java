package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheMaximumSumOfContinuousSubarraysTest {

    @Test
    public void solve01() {
        TheMaximumSumOfContinuousSubarrays demo = new TheMaximumSumOfContinuousSubarrays();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expect = 6;
        int res = demo.solve01(nums);

        Assertions.assertEquals(expect, res);
    }

    @Test
    public void solve02() {
        TheMaximumSumOfContinuousSubarrays demo = new TheMaximumSumOfContinuousSubarrays();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expect = 6;
        int res = demo.solve02(nums);

        Assertions.assertEquals(expect, res);
    }
}