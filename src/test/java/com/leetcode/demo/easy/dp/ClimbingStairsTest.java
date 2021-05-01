package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public void solve01() {
        ClimbingStairs demo = new ClimbingStairs();

        int n1 = 2;
        int expect1 = 2;
        int res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 3;
        int expect2 = 3;
        int res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }
}