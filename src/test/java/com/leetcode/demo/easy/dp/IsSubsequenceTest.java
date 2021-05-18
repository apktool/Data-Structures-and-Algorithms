package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    @Test
    public void solve01() {
        IsSubsequence demo = new IsSubsequence();

        String s1 = "abc";
        String t1 = "ahbgdc";
        boolean res1 = demo.solve01(s1, t1);
        Assertions.assertTrue(res1);

        String s2 = "axc";
        String t2 = "ahbgdc";
        boolean res2 = demo.solve01(s2, t2);
        Assertions.assertFalse(res2);
    }

    @Test
    public void solve02() {
        IsSubsequence demo = new IsSubsequence();

        String s = "abc";
        String t = "ahbgdc";
        boolean res = demo.solve02(s, t);
        Assertions.assertTrue(res);

        String s2 = "axc";
        String t2 = "ahbgdc";
        boolean res2 = demo.solve02(s2, t2);
        Assertions.assertFalse(res2);
    }
}