package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfaWordoccursAsaPrefixOfAnyWordInaSentenceTest {

    @Test
    public void solve01() {
        CheckIfaWordoccursAsaPrefixOfAnyWordInaSentence demo = new CheckIfaWordoccursAsaPrefixOfAnyWordInaSentence();

        String s1 = "i love eating burger", s2 = "burg";
        int expect1 = 4;
        int res1 = demo.solve01(s1, s2);
        Assertions.assertEquals(expect1, res1);

        String s3 = "hellohello hellohellohello", s4 = "ell";
        int expect2 = -1;
        int res2 = demo.solve01(s3, s4);
        Assertions.assertEquals(expect2, res2);
    }
}