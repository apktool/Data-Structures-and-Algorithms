package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumAddToMakeParenthesesValidTest {

    @Test
    public void solve01() {
        MinimumAddToMakeParenthesesValid demo = new MinimumAddToMakeParenthesesValid();

        String s1 = "())";
        int expect1 = 1;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "()))((";
        int expect2 = 4;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}