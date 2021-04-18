package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToLowerCaseTest {

    @Test
    public void solve01() {
        ToLowerCase demo = new ToLowerCase();

        String s1 = "Hello";
        String expect1 = "hello";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "hello";
        String expect2 = "hello";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        ToLowerCase demo = new ToLowerCase();

        String s1 = "Hello";
        String expect1 = "hello";
        String res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "hello";
        String expect2 = "hello";
        String res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);
    }
}