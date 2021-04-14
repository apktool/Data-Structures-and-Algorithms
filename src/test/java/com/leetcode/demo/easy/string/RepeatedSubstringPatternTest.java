package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedSubstringPatternTest {

    @Test
    public void solve01() {
        RepeatedSubstringPattern demo = new RepeatedSubstringPattern();

        String s1 = "abab";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "aba";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(false, res2);
    }

    @Test
    public void solve02() {
        RepeatedSubstringPattern demo = new RepeatedSubstringPattern();

        String s1 = "abab";
        boolean res1 = demo.solve02(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "aba";
        boolean res2 = demo.solve02(s2);
        Assertions.assertEquals(false, res2);
    }
}