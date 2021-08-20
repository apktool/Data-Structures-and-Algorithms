package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePartitioningTest {

    @Test
    public void solve01() {
        PalindromePartitioning demo = new PalindromePartitioning();

        String s1 = "aab";
        List<List<String>> res1 = demo.solve01(s1);
        Assertions.assertIterableEquals(List.of("a", "a", "b"), res1.get(0));
        Assertions.assertIterableEquals(List.of("aa", "b"), res1.get(1));

        String s2 = "a";
        List<List<String>> res2 = demo.solve01(s2);
        Assertions.assertIterableEquals(List.of("a"), res2.get(0));
    }
}