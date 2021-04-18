package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountBinarySubstringsTest {
    @Test
    public void solve01() {
        CountBinarySubstrings demo = new CountBinarySubstrings();

        String s1 = "00110011";
        int expect1 = 6;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "10101";
        int expect2 = 4;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        CountBinarySubstrings demo = new CountBinarySubstrings();

        String s1 = "00110011";
        int expect1 = 6;
        int res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "10101";
        int expect2 = 4;
        int res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);
    }
}