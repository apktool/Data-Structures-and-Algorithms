package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonotoneIncreasingDigitsTest {

    @Test
    public void solve01() {
        MonotoneIncreasingDigits demo = new MonotoneIncreasingDigits();

        int n1 = 332;
        int res1 = demo.solve01(n1);
        int expect1 = 299;
        Assertions.assertEquals(expect1, res1);

        int n2 = 10;
        int res2 = demo.solve01(n2);
        int expect2 = 9;
        Assertions.assertEquals(expect2, res2);

        int n3 = 1234;
        int res3 = demo.solve01(n3);
        int expect3 = 1234;
        Assertions.assertEquals(expect3, res3);
    }
}