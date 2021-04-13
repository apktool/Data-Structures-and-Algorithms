package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddStringsTest {

    @Test
    public void solve01() {
        AddStrings demo = new AddStrings();

        String s1 = "11";
        String s2 = "1";
        String expect = "12";
        String res = demo.solve01(s1, s2);
        Assertions.assertEquals(expect, res);
    }
}