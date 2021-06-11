package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticSlicesTest {

    @Test
    public void solve01() {
        ArithmeticSlices demo = new ArithmeticSlices();

        int[] nums = {1, 2, 3, 4};
        int expect = 3;
        int res = demo.solve01(nums);
        Assertions.assertEquals(expect, res);
    }
}