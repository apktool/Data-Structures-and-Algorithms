package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReformatTheStringTest {

    @Test
    public void solve01() {
        ReformatTheString demo = new ReformatTheString();

        String s1 = "a0b1c2";
        String expect1 = "c2b1a0";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "leetcode";
        String expect2 = "";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "covid2019";
        String expect3 = "d9i1v0o2c";
        String res3 = demo.solve01(s3);
        Assertions.assertEquals(expect3, res3);

        String s4 = "ab123";
        String expect4 = "3b2a1";
        String res4 = demo.solve01(s4);
        Assertions.assertEquals(expect4, res4);
    }

    @Test
    public void solve02() {
        ReformatTheString demo = new ReformatTheString();

        String s1 = "a0b1c2";
        String expect1 = "0a1b2c";
        String res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "leetcode";
        String expect2 = "";
        String res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "covid2019";
        String expect3 = "c2o0v1i9d";
        String res3 = demo.solve02(s3);
        Assertions.assertEquals(expect3, res3);

        String s4 = "ab123";
        String expect4 = "1a2b3";
        String res4 = demo.solve02(s4);
        Assertions.assertEquals(expect4, res4);
    }
}