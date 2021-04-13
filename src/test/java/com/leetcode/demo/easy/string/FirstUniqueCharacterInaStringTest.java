package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterInaStringTest {

    @Test
    public void solve01() {
        FirstUniqueCharacterInaString demo = new FirstUniqueCharacterInaString();

        String s1 = "leetcode";
        Integer expect1 = 0;
        Integer res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "loveleetcode";
        Integer expect2 = 2;
        Integer res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "aabb";
        Integer expect3 = -1;
        Integer res3 = demo.solve01(s3);
        Assertions.assertEquals(expect3, res3);
    }
}