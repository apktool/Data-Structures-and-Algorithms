package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {

    @Test
    public void solve01() {
        CoinChange demo = new CoinChange();

        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        int expect1 = 3;
        int res1 = demo.solve01(coins1, amount1);
        Assertions.assertEquals(expect1, res1);

        int[] coins2 = {2};
        int amount2 = 3;
        int expect2 = -1;
        int res2 = demo.solve01(coins2, amount2);
        Assertions.assertEquals(expect2, res2);
    }
}