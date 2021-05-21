package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void solve01() {
        LongestPalindromicSubstring demo = new LongestPalindromicSubstring();

        String s1 = "babad";
        String expect1 = "bab";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);


        String s2 = "cbbd";
        String expect2 = "bb";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}