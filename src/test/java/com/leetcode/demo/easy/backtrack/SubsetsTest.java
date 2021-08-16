package com.leetcode.demo.easy.backtrack;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubsetsTest {

    @Test
    public void subsets() {
        Subsets demo = new Subsets();
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> res1 = demo.solve01(nums1);

        Assertions.assertIterableEquals(Collections.emptyList(), res1.get(0));
        Assertions.assertIterableEquals(List.of(1), res1.get(1));
        Assertions.assertIterableEquals(List.of(1, 2), res1.get(2));
        Assertions.assertIterableEquals(List.of(1, 2, 3), res1.get(3));
        Assertions.assertIterableEquals(List.of(1, 3), res1.get(4));
        Assertions.assertIterableEquals(List.of(2), res1.get(5));
        Assertions.assertIterableEquals(List.of(2, 3), res1.get(6));
        Assertions.assertIterableEquals(List.of(3), res1.get(7));
    }
}