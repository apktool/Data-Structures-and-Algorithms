package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OnesAndZeroesTest {

    @Test
    public void solve01() {
        OnesAndZeroes demo = new OnesAndZeroes();

        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        int expect = 4;
        int res = demo.solve01(strs, m, n);
        Assertions.assertEquals(res, expect);
    }
}