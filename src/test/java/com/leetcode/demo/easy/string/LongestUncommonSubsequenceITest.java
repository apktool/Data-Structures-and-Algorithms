package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestUncommonSubsequenceITest {

    @Test
    public void solve01() {
        LongestUncommonSubsequenceI demo = new LongestUncommonSubsequenceI();
        String s1 = "aba";
        String s2 = "cdc";
        int res = demo.solve01(s1, s2);
        Assertions.assertEquals(3, res);
    }
}