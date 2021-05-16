package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisorGameTest {
    @Test
    public void solve01() {
        DivisorGame demo = new DivisorGame();

        int n1 = 3;
        boolean expect1 = false;
        boolean res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 4;
        boolean expect2 = true;
        boolean res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        DivisorGame demo = new DivisorGame();

        int n1 = 3;
        boolean expect1 = false;
        boolean res1 = demo.solve02(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 4;
        boolean expect2 = true;
        boolean res2 = demo.solve02(n2);
        Assertions.assertEquals(expect2, res2);
    }
}