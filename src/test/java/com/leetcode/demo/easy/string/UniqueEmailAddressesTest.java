package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddressesTest {

    @Test
    public void solve01() {
        UniqueEmailAddresses demo = new UniqueEmailAddresses();

        String[] s1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int expect1 = 2;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String[] s2 = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int expect2 = 1;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }


    @Test
    public void solve02() {
        UniqueEmailAddresses demo = new UniqueEmailAddresses();

        String[] s1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int expect1 = 2;
        int res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String[] s2 = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int expect2 = 1;
        int res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);
    }
}