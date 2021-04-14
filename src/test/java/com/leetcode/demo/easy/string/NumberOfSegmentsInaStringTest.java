package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSegmentsInaStringTest {

    @Test
    public void solve01() {
        NumberOfSegmentsInaString demo = new NumberOfSegmentsInaString();

        String s1 = "Hello, my name is John";
        int expect1 = 5;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = ", , , ,        a, eaefa";
        int expect2 = 6;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve03() {
        NumberOfSegmentsInaString demo = new NumberOfSegmentsInaString();

        String s1 = "Hello, my name is John";
        int expect1 = 5;
        int res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = ", , , ,        a, eaefa";
        int expect2 = 6;
        int res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);
    }
}