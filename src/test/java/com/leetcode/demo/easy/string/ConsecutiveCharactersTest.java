package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsecutiveCharactersTest {

    @Test
    public void solve01() {
        ConsecutiveCharacters demo = new ConsecutiveCharacters();

        String s1 = "leetcode";
        int expect1 = 2;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "abbcccddddeeeeedcba";
        int expect2 = 5;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}