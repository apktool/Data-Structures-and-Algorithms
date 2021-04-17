package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsInaStringIiiTest {

    @Test
    public void solve01() {
        ReverseWordsInaStringIii demo = new ReverseWordsInaStringIii();

        String s = "Let's take LeetCode contest";
        String expect = "s'teL ekat edoCteeL tsetnoc";
        String res = demo.solve01(s);
        Assertions.assertEquals(expect, res);
    }
}