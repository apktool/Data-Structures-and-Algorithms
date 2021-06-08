package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessNumberHigherOrLowerIiTest {

    @Test
    public void solve01() {
        GuessNumberHigherOrLowerIi demo = new GuessNumberHigherOrLowerIi();

        int n1 = 10;
        int expect1 = 16;
        int res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 21;
        int expect2 = 52;
        int res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }


    @Test
    public void solve02() {
        GuessNumberHigherOrLowerIi demo = new GuessNumberHigherOrLowerIi();

        int n1 = 10;
        int expect1 = 16;
        int res1 = demo.solve02(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 21;
        int expect2 = 52;
        int res2 = demo.solve02(n2);
        Assertions.assertEquals(expect2, res2);
    }
}