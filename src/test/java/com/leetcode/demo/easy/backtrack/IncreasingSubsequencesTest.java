package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingSubsequencesTest {

    @Test
    public void solve01() {
        IncreasingSubsequences demo = new IncreasingSubsequences();

        int[] nums1 = {4, 6, 7, 7};
        List<List<Integer>> res1 = demo.solve01(nums1);
        Assertions.assertIterableEquals(List.of(4, 6), res1.get(0));
        Assertions.assertIterableEquals(List.of(4, 6, 7), res1.get(1));
        Assertions.assertIterableEquals(List.of(4, 6, 7, 7), res1.get(2));
        Assertions.assertIterableEquals(List.of(4, 7), res1.get(3));
        Assertions.assertIterableEquals(List.of(4, 7, 7), res1.get(4));
        Assertions.assertIterableEquals(List.of(6, 7), res1.get(5));
        Assertions.assertIterableEquals(List.of(6, 7, 7), res1.get(6));
        Assertions.assertIterableEquals(List.of(7, 7), res1.get(7));
    }
}