package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitaStringInBalancedStringsTest {

    @Test
    public void solve01() {
        SplitaStringInBalancedStrings demo = new SplitaStringInBalancedStrings();

        String s1 = "RLRRLLRLRL";
        int expect1 = 4;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "RLLLLRRRLR";
        int expect2 = 3;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}