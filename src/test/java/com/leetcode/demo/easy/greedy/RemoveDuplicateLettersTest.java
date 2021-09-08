package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateLettersTest {

    @Test
    public void solve01() {
        RemoveDuplicateLetters demo = new RemoveDuplicateLetters();

        String s1 = "bcabc";
        String res1 = demo.solve01(s1);
        String expect1 = "abc";
        Assertions.assertEquals(expect1, res1);

        String s2 = "cbacdcbc";
        String res2 = demo.solve01(s2);
        String expect2 = "acdb";
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        RemoveDuplicateLetters demo = new RemoveDuplicateLetters();

        String s1 = "bcabc";
        String res1 = demo.solve02(s1);
        String expect1 = "abc";
        Assertions.assertEquals(expect1, res1);

        String s2 = "cbacdcbc";
        String res2 = demo.solve02(s2);
        String expect2 = "acdb";
        Assertions.assertEquals(expect2, res2);
    }
}