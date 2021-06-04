package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerBreakTest {

    @Test
    public void solve01() {
        IntegerBreak demo = new IntegerBreak();

        int n1 = 2;
        int expect1 = 1;
        int res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 10;
        int expect2 = 36;
        int res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }
}