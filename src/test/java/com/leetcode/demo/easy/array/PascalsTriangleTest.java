package com.leetcode.demo.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalsTriangleTest {
    @Test
    public void solve1() {
        PascalsTriangle demo = new PascalsTriangle();

        int nums1 = 5;
        List<List<Integer>> expect1 = new ArrayList<>(nums1 + 1);
        expect1.add(Arrays.asList(1));
        expect1.add(Arrays.asList(1, 1));
        expect1.add(Arrays.asList(1, 2, 1));
        expect1.add(Arrays.asList(1, 3, 3, 1));
        expect1.add(Arrays.asList(1, 4, 6, 4, 1));
        List<List<Integer>> res1 = demo.solve01(nums1);
        Assertions.assertIterableEquals(expect1, res1);
    }
}