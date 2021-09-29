package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreAfterFlippingMatrixTest {

    @Test
    public void solve01() {
        ScoreAfterFlippingMatrix demo = new ScoreAfterFlippingMatrix();

        int[][] grid1 = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int res1 = demo.solve01(grid1);
        int expect1 = 39;
        Assertions.assertEquals(expect1, res1);

        int[][] grid2 = {{1, 1, 0, 0}, {1, 0, 0, 0}, {0, 1, 1, 0}};
        int res2 = demo.solve01(grid2);
        int expect2 = 40;
        Assertions.assertEquals(expect2, res2);
    }
}