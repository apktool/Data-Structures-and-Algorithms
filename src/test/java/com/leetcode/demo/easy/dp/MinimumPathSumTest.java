package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumPathSumTest {
    @Test
    public void solve01() {
        MinimumPathSum demo = new MinimumPathSum();

        int[][] nums1 = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int expect1 = 7;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[][] nums2 = {{1, 2, 3}, {4, 5, 6}};
        int expect2 = 12;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}