package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    public void solve01() {
        RomanToInteger demo = new RomanToInteger();

        String s1 = "III";
        int expect1 = 3;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(res1, expect1);

        String s2 = "IV";
        int expect2 = 4;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(res2, expect2);
    }

    @Test
    public void solve02() {
        RomanToInteger demo = new RomanToInteger();

        String s1 = "III";
        int expect1 = 3;
        int res1 = demo.solve02(s1);
        Assertions.assertEquals(res1, expect1);

        String s2 = "IV";
        int expect2 = 4;
        int res2 = demo.solve02(s2);
        Assertions.assertEquals(res2, expect2);
    }
}