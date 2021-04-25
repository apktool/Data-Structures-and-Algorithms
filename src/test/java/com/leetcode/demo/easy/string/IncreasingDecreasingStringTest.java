package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingDecreasingStringTest {

    @Test
    public void solve01() {
        IncreasingDecreasingString demo = new IncreasingDecreasingString();

        String s1 = "aaaabbbbcccc";
        String expect1 = "abccbaabccba";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "rat";
        String expect2 = "art";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "leetcode";
        String expect3 = "cdelotee";
        String res3 = demo.solve01(s3);
        Assertions.assertEquals(expect3, res3);
    }
}