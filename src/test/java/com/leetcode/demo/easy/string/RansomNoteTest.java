package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    @Test
    public void solve01() {
        RansomNote demo = new RansomNote();
        String s1 = "aa";
        String s2 = "ab";
        boolean res = demo.solve01(s1, s2);
        Assertions.assertEquals(false, res);
    }

    @Test
    public void solve02() {
        RansomNote demo = new RansomNote();
        String s1 = "aa";
        String s2 = "aab";
        boolean res = demo.solve01(s1, s2);
        Assertions.assertEquals(true, res);
    }
}