package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UglyNumberIiTest {

    @Test
    public void solve01() {
        UglyNumberIi demo = new UglyNumberIi();

        int n1 = 10;
        int res1 = demo.solve01(n1);
        int expect1 = 12;
        Assertions.assertEquals(expect1, res1);

        int n2 = 1;
        int res2 = demo.solve01(n2);
        int expect2 = 1;
        Assertions.assertEquals(expect2, res2);
    }
}