package com.leetcode.demo.easy.backtrack;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsetsIiTest {

    @Test
    public void solve01() {
        SubsetsIi demo = new SubsetsIi();

        int[] nums1 = {0};
        List<List<Integer>> res1 = demo.solve01(nums1);
        Assertions.assertIterableEquals(Collections.emptyList(), res1.get(0));
        Assertions.assertIterableEquals(List.of(0), res1.get(1));

        int[] nums2 = {1, 2, 2};
        List<List<Integer>> res2 = demo.solve01(nums2);
        Assertions.assertIterableEquals(Collections.emptyList(), res2.get(0));
        Assertions.assertIterableEquals(List.of(1), res2.get(1));
        Assertions.assertIterableEquals(List.of(1, 2), res2.get(2));
        Assertions.assertIterableEquals(List.of(1, 2, 2), res2.get(3));
        Assertions.assertIterableEquals(List.of(2), res2.get(4));
        Assertions.assertIterableEquals(List.of(2, 2), res2.get(5));
    }
}