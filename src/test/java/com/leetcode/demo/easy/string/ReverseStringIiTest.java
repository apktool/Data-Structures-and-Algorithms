package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.leetcode.demo.easy.string.ReverseStringIi;

public class ReverseStringIiTest {

    @Test
    public void solve01() {
        ReverseStringIi demo = new ReverseStringIi();
        String s = "abcdefg";
        int k = 2;
        String expect = "bacdfeg";
        String res = demo.solve01(s, k);
        Assertions.assertEquals(res, expect);
    }
}