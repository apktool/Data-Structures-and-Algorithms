package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountNumbersWithUniqueDigitsTest {

    @Test
    public void solve01() {
        CountNumbersWithUniqueDigits demo = new CountNumbersWithUniqueDigits();

        int n = 2;
        int expect = 91;
        int res = demo.solve01(n);
        Assertions.assertEquals(expect, res);
    }
}