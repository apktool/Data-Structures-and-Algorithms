package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostCommonWordTest {

    @Test
    public void solve01() {
        MostCommonWord demo = new MostCommonWord();

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        String expect = "ball";
        String res = demo.solve01(paragraph, banned);

        Assertions.assertEquals(expect, res);
    }
}