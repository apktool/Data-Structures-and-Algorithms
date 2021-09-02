package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllPathsFromSourceToTargetTest {

    @Test
    public void solve01() {
        AllPathsFromSourceToTarget demo = new AllPathsFromSourceToTarget();

        int[][] nums1 = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> res1 = demo.solve01(nums1);
        Assertions.assertIterableEquals(List.of(0, 1, 3), res1.get(0));
        Assertions.assertIterableEquals(List.of(0, 2, 3), res1.get(1));

        int[][] nums2 = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> res2 = demo.solve01(nums2);
        Assertions.assertIterableEquals(List.of(0, 4), res2.get(0));
        Assertions.assertIterableEquals(List.of(0, 3, 4), res2.get(1));
        Assertions.assertIterableEquals(List.of(0, 1, 3, 4), res2.get(2));
        Assertions.assertIterableEquals(List.of(0, 1, 2, 3, 4), res2.get(3));
        Assertions.assertIterableEquals(List.of(0, 1, 4), res2.get(4));
    }

    @Test
    public void solve02() {
        AllPathsFromSourceToTarget demo = new AllPathsFromSourceToTarget();

        int[][] nums1 = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> res1 = demo.solve02(nums1);
        Assertions.assertIterableEquals(List.of(0, 1, 3), res1.get(0));
        Assertions.assertIterableEquals(List.of(0, 2, 3), res1.get(1));

        int[][] nums2 = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};
        List<List<Integer>> res2 = demo.solve02(nums2);
        Assertions.assertIterableEquals(List.of(0, 4), res2.get(0));
        Assertions.assertIterableEquals(List.of(0, 3, 4), res2.get(1));
        Assertions.assertIterableEquals(List.of(0, 1, 3, 4), res2.get(2));
        Assertions.assertIterableEquals(List.of(0, 1, 2, 3, 4), res2.get(3));
        Assertions.assertIterableEquals(List.of(0, 1, 4), res2.get(4));
    }
}