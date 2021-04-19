package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuddyStringsTest {

    @Test
    public void solve01() {
        BuddyStrings demo = new BuddyStrings();

        String s1 = "ab";
        String s2 = "ba";
        boolean res1 = demo.solve01(s1, s2);
        Assertions.assertEquals(true, res1);

        String s3 = "ab";
        String s4 = "ab";
        boolean res2 = demo.solve01(s3, s4);
        Assertions.assertEquals(false, res2);
    }
}