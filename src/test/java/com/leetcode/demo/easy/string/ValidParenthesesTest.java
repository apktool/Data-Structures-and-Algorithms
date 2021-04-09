package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    public void solve01() {
        ValidParentheses demo = new ValidParentheses();

        String s1 = "()[]{}";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(true, res1);


        String s2 = "]";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(false, res2);
    }
}