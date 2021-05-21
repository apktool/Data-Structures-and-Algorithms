package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {

    @Test
    public void solve01() {
        UniquePaths demo = new UniquePaths();

        int m = 3;
        int n = 2;
        int res = demo.solve01(m, n);
        int expect = 3;
        Assertions.assertEquals(expect, res);
    }
}