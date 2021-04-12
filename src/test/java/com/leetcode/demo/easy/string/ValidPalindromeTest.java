package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void solve01() {
        ValidPalindrome demo = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean res = demo.solve01(s);
        Assertions.assertEquals(true, res);
    }
}