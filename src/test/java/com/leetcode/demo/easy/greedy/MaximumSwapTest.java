package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSwapTest {

    @Test
    public void solve01() {
        MaximumSwap demo = new MaximumSwap();

        int num1 = 2736;
        int res1 = demo.solve01(num1);
        int expect1 = 7236;
        Assertions.assertEquals(expect1, res1);

        /*
        int num2 = 9973;
        int res2 = demo.solve01(num2);
        int expect2 = 9973;
        Assertions.assertEquals(expect2, res2);
         */
    }
}