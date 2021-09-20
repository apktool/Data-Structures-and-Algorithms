package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dota2SenateTest {

    @Test
    public void solve01() {
        Dota2Senate demo = new Dota2Senate();

        String str1 = "RD";
        String expect1 = "Radiant";
        String res1 = demo.solve01(str1);
        Assertions.assertEquals(expect1, res1);

        String str2 = "RDD";
        String expect2 = "Dire";
        String res2 = demo.solve01(str2);
        Assertions.assertEquals(expect2, res2);
    }
}