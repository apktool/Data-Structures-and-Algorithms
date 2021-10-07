package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchA2dMatrixIiTest {

    @Test
    public void solve01() {
        SearchA2dMatrixIi demo = new SearchA2dMatrixIi();

        int[][] nums1 = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target1 = 5;
        boolean res1 = demo.solve01(nums1, target1);
        Assertions.assertTrue(res1);
    }
}