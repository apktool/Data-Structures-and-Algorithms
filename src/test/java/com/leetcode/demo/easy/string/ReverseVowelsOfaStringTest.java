package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseVowelsOfaStringTest {

    @Test
    public void solve01() {
        ReverseVowelsOfaString demo = new ReverseVowelsOfaString();

        String s1 = "leetcode";
        String expect1 = "leotcede";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "aA";
        String expect2 = "Aa";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}