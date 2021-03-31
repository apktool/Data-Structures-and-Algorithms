package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignCookiesTest {

    @Test
    public void solve01() {
        AssignCookies demo = new AssignCookies();

        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int expected = 1;
        int res = demo.solve01(g, s);
        Assertions.assertEquals(expected, res);
    }
}