package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterleavingStringTest {

    @Test
    public void solve01() {
        InterleavingString demo = new InterleavingString();

        /*
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
         */
        String s1 = "bacc";
        String s2 = "aabcce";
        String s3 = "abaacbccec";

        boolean res = demo.solve01(s1, s2, s3);
        Assertions.assertTrue(res);
    }
}