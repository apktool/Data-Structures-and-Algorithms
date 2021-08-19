package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestoreIpAddressesTest {

    @Test
    public void solve01() {
        RestoreIpAddresses demo = new RestoreIpAddresses();

        String s1 = "25525511135";
        List<String> res1 = demo.solve01(s1);
        Assertions.assertEquals("255.255.11.135", res1.get(0));
        Assertions.assertEquals("255.255.111.35", res1.get(1));

        String s2 = "0000";
        List<String> res2 = demo.solve01(s2);
        Assertions.assertEquals("0.0.0.0", res2.get(0));
    }
}