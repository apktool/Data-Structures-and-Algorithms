package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemovePalindromicSubsequencesTest {

    @Test
    public void solve01() {
        RemovePalindromicSubsequences demo = new RemovePalindromicSubsequences();

        String s1 = "ababa";
        int expect1 = 1;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "abb";
        int expect2 = 2;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "baabb";
        int expect3 = 2;
        int res3 = demo.solve01(s3);
        Assertions.assertEquals(expect3, res3);
    }
}