package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeIiTest {

    @Test
    public void solve01() {
        ValidPalindromeIi demo = new ValidPalindromeIi();

        String s1 = "aba";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "abca";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(true, res2);

        String s3 = "abc";
        boolean res3 = demo.solve01(s3);
        Assertions.assertEquals(false, res3);
    }
}