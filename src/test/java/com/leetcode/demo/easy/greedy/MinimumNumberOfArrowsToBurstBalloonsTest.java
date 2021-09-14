package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfArrowsToBurstBalloonsTest {

    @Test
    public void solve01() {
        MinimumNumberOfArrowsToBurstBalloons demo = new MinimumNumberOfArrowsToBurstBalloons();

        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int res1 = demo.solve01(points1);
        int expect1 = 2;
        Assertions.assertEquals(expect1, res1);

        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int res2 = demo.solve01(points2);
        int expect2 = 4;
        Assertions.assertEquals(expect2, res2);
    }
}