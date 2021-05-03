package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumQueryImmutableTest {

    @Test
    public void sumRange() {
        int[] nums = {-2, 0, 3, -5, 2, -1};

        RangeSumQueryImmutable demo = new RangeSumQueryImmutable(nums);
        int expect = 1;
        int res = demo.sumRange(0, 2);
        Assertions.assertEquals(expect, res);
    }
}