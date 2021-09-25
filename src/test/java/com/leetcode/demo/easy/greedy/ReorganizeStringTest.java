package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReorganizeStringTest {

    @Test
    public void solve01() {
        ReorganizeString demo = new ReorganizeString();

        String s1 = "aab";
        String expect1 = "aba";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "aaab";
        String expect2 = "";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}