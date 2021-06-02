package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectSquaresTest {

    @Test
    public void solve01() {
        PerfectSquares demo = new PerfectSquares();

        int n1 = 12;
        int expect1 = 3;
        int res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 13;
        int expect2 = 2;
        int res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }
}