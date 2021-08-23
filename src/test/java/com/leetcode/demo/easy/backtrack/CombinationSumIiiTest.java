package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumIiiTest {

    @Test
    public void solve01() {
        CombinationSumIii demo = new CombinationSumIii();

        List<List<Integer>> res1 = demo.solve01(3, 7);
        Assertions.assertIterableEquals(List.of(1, 2, 4), res1.get(0));

        List<List<Integer>> res2 = demo.solve01(3, 9);
        Assertions.assertIterableEquals(List.of(1, 2, 6), res2.get(0));
        Assertions.assertIterableEquals(List.of(1, 3, 5), res2.get(1));
        Assertions.assertIterableEquals(List.of(2, 3, 4), res2.get(2));

        List<List<Integer>> res3 = demo.solve01(9, 45);
        Assertions.assertIterableEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), res3.get(0));
    }
}