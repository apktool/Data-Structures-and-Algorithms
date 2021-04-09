package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    public void solve01() {
        LongestCommonPrefix demo = new LongestCommonPrefix();

        String[] s1 = {"flower", "flow", "flight"};
        String expect1 = "fl";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(res1, expect1);

        String[] s2 = {"ab", "a"};
        String expect2 = "a";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(res2, expect2);
    }
}