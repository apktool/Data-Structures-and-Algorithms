package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {

    @Test
    public void solve01() {
        CountAndSay demo = new CountAndSay();

        int num = 4;
        String expect = "1211";
        String res = demo.solve01(num);
        Assertions.assertEquals(expect, res);
    }
}