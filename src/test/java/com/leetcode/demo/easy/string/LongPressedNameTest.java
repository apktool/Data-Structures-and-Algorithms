package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongPressedNameTest {

    @Test
    public void solve01() {
        LongPressedName demo = new LongPressedName();

        String s1 = "alex";
        String s2 = "aaleex";
        boolean res1 = demo.solve01(s1, s2);
        Assertions.assertEquals(true, res1);

        String s3 = "alex";
        String s4 = "aaleexa";
        boolean res2 = demo.solve01(s3, s4);
        Assertions.assertEquals(false, res2);
    }
}