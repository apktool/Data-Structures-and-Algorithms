package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecodeWaysTest {

    @Test
    public void solve01() {
        DecodeWays demo = new DecodeWays();

        String s1 = "12";
        int expect1 = 2;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "226";
        int expect2 = 3;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}