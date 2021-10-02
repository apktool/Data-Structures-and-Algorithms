package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringWithoutAaaOrBbbTest {

    @Test
    public void solve01() {
        StringWithoutAaaOrBbb demo = new StringWithoutAaaOrBbb();

        int a1 = 1, b1 = 2;
        String re1 = demo.solve01(a1, b1);
        String expect1 = "bba";
        Assertions.assertEquals(expect1, re1);

        int a2 = 4, b2 = 1;
        String re2 = demo.solve01(a2, b2);
        String expect2 = "aabaa";
        Assertions.assertEquals(expect2, re2);

    }
}