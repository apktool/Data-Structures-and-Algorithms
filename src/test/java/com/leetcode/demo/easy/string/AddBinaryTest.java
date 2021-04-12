package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {

    @Test
    public void solve01() {
        AddBinary demo = new AddBinary();
        String s1 = "11";
        String s2 = "1";
        String expect = "100";
        String res = demo.solve01(s1, s2);
        Assertions.assertEquals(expect, res);
    }
}