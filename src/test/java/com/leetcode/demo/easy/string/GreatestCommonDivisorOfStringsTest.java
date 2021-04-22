package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorOfStringsTest {

    @Test
    public void solve01() {
        GreatestCommonDivisorOfStrings demo = new GreatestCommonDivisorOfStrings();

        String s1 = "ABCABC", s2 = "ABC";
        String expect = "ABC";
        String res = demo.solve01(s1, s2);
        Assertions.assertEquals(expect, res);
    }
}