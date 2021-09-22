package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesisStringTest {

    @Test
    public void solve01() {
        ValidParenthesisString demo = new ValidParenthesisString();

        String s1 = "()";
        boolean res1 = demo.solve01(s1);
        Assertions.assertTrue(res1);

        String s2 = "(*)";
        boolean res2 = demo.solve01(s2);
        Assertions.assertTrue(res2);

        String s3 = "(*))";
        boolean res3 = demo.solve01(s3);
        Assertions.assertTrue(res3);
    }
}