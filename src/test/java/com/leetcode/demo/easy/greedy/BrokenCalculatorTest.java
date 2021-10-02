package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BrokenCalculatorTest {

    @Test
    public void solve01() {
        BrokenCalculator demo = new BrokenCalculator();

        int a1 = 2, b1 = 3;
        int res1 = demo.solve01(a1, b1);
        int expect1 = 2;
        Assertions.assertEquals(expect1, res1);

        int a2 = 5, b2 = 8;
        int res2 = demo.solve01(a2, b2);
        int expect2 = 2;
        Assertions.assertEquals(expect2, res2);
    }
}