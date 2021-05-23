package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsIiTest {

    @Test
    public void solve01() {
        UniquePathsIi demo = new UniquePathsIi();

        int[][] nums1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expect1 = 2;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[][] nums2 = {{1, 0}};
        int expect2 = 0;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}