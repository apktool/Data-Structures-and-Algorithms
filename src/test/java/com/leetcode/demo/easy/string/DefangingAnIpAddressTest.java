package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefangingAnIpAddressTest {

    @Test
    public void solve01() {
        DefangingAnIpAddress demo = new DefangingAnIpAddress();

        String s1 = "1.1.1.1";
        String expect1 = "1[.]1[.]1[.]1";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        DefangingAnIpAddress demo = new DefangingAnIpAddress();

        String s1 = "1.1.1.1";
        String expect1 = "1[.]1[.]1[.]1";
        String res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);
    }
}