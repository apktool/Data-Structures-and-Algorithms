package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchA2dMatrixTest {

    @Test
    public void solve01() {
        SearchA2dMatrix demo = new SearchA2dMatrix();

        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target1 = 3;
        boolean res1 = demo.solve01(matrix1, target1);
        Assertions.assertTrue(res1);

        int[][] matrix2 = {{1}};
        int target2 = 1;
        boolean res2 = demo.solve01(matrix2, target2);
        Assertions.assertTrue(res2);
    }
}