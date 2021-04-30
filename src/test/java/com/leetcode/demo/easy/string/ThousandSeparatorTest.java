package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThousandSeparatorTest {

    @Test
    public void solve01() {
        ThousandSeparator demo = new ThousandSeparator();

        int n1 = 987;
        String expect1 = "987";
        String res1 = demo.solve01(n1);
        Assertions.assertEquals(expect1, res1);
    }
}