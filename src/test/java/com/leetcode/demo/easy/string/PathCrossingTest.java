package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathCrossingTest {

    @Test
    public void solve01() {
        PathCrossing demo = new PathCrossing();

        String s1 = "NES";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(false, res1);

        String s2 = "NESWW";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(true, res2);
    }
}