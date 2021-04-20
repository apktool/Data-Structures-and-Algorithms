package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseOnlyLettersTest {
    @Test
    public void solve01() {
        ReverseOnlyLetters demo = new ReverseOnlyLetters();

        String s1 = "ab-cd";
        String expect1 = "dc-ba";
        String res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        ReverseOnlyLetters demo = new ReverseOnlyLetters();

        String s1 = "ab-cd";
        String expect1 = "dc-ba";
        String res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);
    }
}