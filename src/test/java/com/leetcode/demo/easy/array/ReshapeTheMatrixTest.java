package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReshapeTheMatrixTest {

    @Test
    public void solve01() {
        ReshapeTheMatrix demo = new ReshapeTheMatrix();

        int[][] nums1 = {{1, 2}, {3, 4}};
        int r1 = 1;
        int c1 = 4;
        int[][] expected1 = {{1, 2, 3, 4}};
        int[][] res1 = demo.solve01(nums1, r1, c1);
        Assertions.assertArrayEquals(expected1, res1);

        int[][] nums2 = {{1, 2}, {3, 4}};
        int r2 = 2;
        int c2 = 4;
        int[][] expected2 = nums2;
        int[][] res2 = demo.solve01(nums2, r2, c2);
        Assertions.assertArrayEquals(expected2, res2);
    }


    @Test
    public void solve02() {
        ReshapeTheMatrix demo = new ReshapeTheMatrix();

        int[][] nums1 = {{1, 2}, {3, 4}};
        int r1 = 1;
        int c1 = 4;
        int[][] expected1 = {{1, 2, 3, 4}};
        int[][] res1 = demo.solve02(nums1, r1, c1);
        Assertions.assertArrayEquals(expected1, res1);

        int[][] nums2 = {{1, 2}, {3, 4}};
        int r2 = 2;
        int c2 = 4;
        int[][] expected2 = nums2;
        int[][] res2 = demo.solve02(nums2, r2, c2);
        Assertions.assertArrayEquals(expected2, res2);
    }
}