package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeStepsProblemIcciTest {

    @Test
    public void solve01() {
        ThreeStepsProblemIcci demo = new ThreeStepsProblemIcci();

        int n1 = 3;
        int expect1 = 4;
        int res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);

        int n2 = 5;
        int expect2 = 13;
        int res2 = demo.solve01(n2);
        Assertions.assertEquals(expect2, res2);
    }
}