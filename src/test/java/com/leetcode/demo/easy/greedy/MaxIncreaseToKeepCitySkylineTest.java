package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxIncreaseToKeepCitySkylineTest {

    @Test
    public void solve01() {
        MaxIncreaseToKeepCitySkyline demo = new MaxIncreaseToKeepCitySkyline();

        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int expect1 = 35;
        int res1 = demo.solve01(grid);
        Assertions.assertEquals(expect1, res1);
    }
}