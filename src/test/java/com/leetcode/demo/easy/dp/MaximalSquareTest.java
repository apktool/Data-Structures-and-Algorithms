package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximalSquareTest {

    @Test
    public void solve01() {
        MaximalSquare demo = new MaximalSquare();

        char[][] matrix1 = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        int expect1 = 4;
        int res1 = demo.solve01(matrix1);
        Assertions.assertEquals(expect1, res1);

        char[][] matrix2 = {
                {'0', '1'},
                {'1', '0'}
        };

        int expect2 = 1;
        int res2 = demo.solve01(matrix2);
        Assertions.assertEquals(expect2, res2);

    }
}