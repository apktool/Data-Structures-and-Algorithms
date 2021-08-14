package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationsTest {

    @Test
    public void solve01() {
        Combinations demo = new Combinations();

        int n1 = 3;
        int k1 = 2;
        List<List<Integer>> res1 = demo.solve01(n1, k1);
        Assertions.assertIterableEquals(List.of(1, 2), res1.get(0));
        Assertions.assertIterableEquals(List.of(1, 3), res1.get(1));
        Assertions.assertIterableEquals(List.of(2, 3), res1.get(2));

        int n2 = 2;
        int k2 = 2;
        List<List<Integer>> res2 = demo.solve01(n2, k2);
        Assertions.assertIterableEquals(List.of(1, 2), res2.get(0));
    }
}