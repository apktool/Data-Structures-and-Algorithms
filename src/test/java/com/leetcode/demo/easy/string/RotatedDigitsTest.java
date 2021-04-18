package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotatedDigitsTest {

    @Test
    public void solve01() {
        RotatedDigits demo = new RotatedDigits();

        int n1 = 10;
        int expect1 = 4;
        int res1 = demo.solve01(n1);
        Assertions.assertEquals(res1, expect1);
    }

    @Test
    public void solve02() {
        RotatedDigits demo = new RotatedDigits();

        int n1 = 10;
        int expect1 = 4;
        int res1 = demo.solve02(n1);
        Assertions.assertEquals(res1, expect1);
    }
}