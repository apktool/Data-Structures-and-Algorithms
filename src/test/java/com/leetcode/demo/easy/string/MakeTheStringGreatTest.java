package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeTheStringGreatTest {

    @Test
    public void solve01() {
        MakeTheStringGreat demo = new MakeTheStringGreat();

        String s1 = "leEeetcode";
        String expect1 = "leetcode";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "abBAcC";
        String expect2 = "";
        String res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        MakeTheStringGreat demo = new MakeTheStringGreat();

        String s1 = "leEeetcode";
        String expect1 = "leetcode";
        String res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "abBAcC";
        String expect2 = "";
        String res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);
    }
}