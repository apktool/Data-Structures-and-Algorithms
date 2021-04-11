package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementStrstrTest {

    @Test
    public void solve01() {
        ImplementStrstr demo = new ImplementStrstr();

        String s1 = "hello";
        String s2 = "ll";
        int expect = 2;
        int res = demo.solve01(s1, s2);
        Assertions.assertEquals(expect, res);
    }

    @Test
    public void solve02() {
        ImplementStrstr demo = new ImplementStrstr();

        String s1 = "hello";
        String s2 = "ll";
        int expect = 2;
        int res = demo.solve02(s1, s2);
        Assertions.assertEquals(expect, res);
    }

    @Test
    public void solve03() {
        ImplementStrstr demo = new ImplementStrstr();

        String s1 = "hello";
        String s2 = "ll";
        int expect = 2;
        int res = demo.solve03(s1, s2);
        Assertions.assertEquals(expect, res);
    }
}