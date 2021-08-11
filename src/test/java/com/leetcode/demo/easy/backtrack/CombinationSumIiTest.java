package com.leetcode.demo.easy.backtrack;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CombinationSumIiTest {

    @Test
    public void solve01() {
        CombinationSumIi demo = new CombinationSumIi();

        int[] nums1 = {2, 3, 6, 7};
        int n1 = 7;
        List<List<Integer>> res1 = demo.solve01(nums1, n1);
        Assertions.assertIterableEquals(List.of(7), res1.get(0));

        int[] nums2 = {2};
        int n2 = 1;
        List<List<Integer>> res2 = demo.solve01(nums2, n2);
        Assertions.assertIterableEquals(Collections.emptyList(), res2);

        int[] nums3 = {2, 5, 2, 1, 2};
        int n3 = 5;
        List<List<Integer>> res3 = demo.solve01(nums3, n3);
        Assertions.assertIterableEquals(List.of(1, 2, 2), res3.get(0));
        Assertions.assertIterableEquals(List.of(5), res3.get(1));
    }
}