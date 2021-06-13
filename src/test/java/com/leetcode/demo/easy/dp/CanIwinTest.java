package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanIwinTest {

    @Test
    public void canIWin() {
        CanIwin demo = new CanIwin();

        int max = 10;
        int total = 11;
        boolean res = demo.canIWin(max, total);
        Assertions.assertFalse(res);
    }
}