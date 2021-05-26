package com.leetcode.demo.easy.dp;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePartitioningTest {

    @Test
    public void solve01() {
        PalindromePartitioning demo = new PalindromePartitioning();

        String s1 = "aab";
        List<List<String>> res1 = demo.solve01(s1);
        List<List<String>> expect1 = List.of(List.of("a", "a", "b"), List.of("aa", "b"));
        for (int i = 0; i < expect1.size(); i++) {
            Assertions.assertLinesMatch(expect1.get(i), res1.get(i));
        }

        String s2 = "a";
        List<List<String>> res2 = demo.solve01(s2);
        List<List<String>> expect2 = List.of(List.of("a"));
        for (int i = 0; i < expect2.size(); i++) {
            Assertions.assertLinesMatch(expect2.get(i), res2.get(i));
        }
    }
}