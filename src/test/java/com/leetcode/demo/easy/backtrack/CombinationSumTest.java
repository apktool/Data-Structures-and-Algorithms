package com.leetcode.demo.easy.backtrack;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumTest {

    @Test
    public void solve01() {
        CombinationSum demo = new CombinationSum();

        int[] nums1 = {2, 3, 6, 7};
        int n1 = 7;
        List<List<Integer>> res1 = demo.solve01(nums1, n1);
        Assertions.assertIterableEquals(List.of(2, 2, 3), res1.get(0));
        Assertions.assertIterableEquals(List.of(7), res1.get(1));

        int[] nums2 = {2};
        int n2 = 1;
        List<List<Integer>> res2 = demo.solve01(nums2, n2);
        Assertions.assertIterableEquals(Collections.emptyList(), res2);
    }

    @Test
    public void solve02() {
        CombinationSum demo = new CombinationSum();

        int[] nums1 = {2, 3, 6, 7};
        int n1 = 7;
        List<List<Integer>> res1 = demo.solve02(nums1, n1);
        Assertions.assertIterableEquals(List.of(7), res1.get(0));
        Assertions.assertIterableEquals(List.of(2, 2, 3), res1.get(1));

        int[] nums2 = {2};
        int n2 = 1;
        List<List<Integer>> res2 = demo.solve02(nums2, n2);
        Assertions.assertIterableEquals(Collections.emptyList(), res2);
    }
}