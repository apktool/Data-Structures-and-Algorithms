package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTest {

    @Test
    public void solve01() {
        TransposeMatrix demo = new TransposeMatrix();

        int[][] nums1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expect1 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}};

        int[][] res1 = demo.solve01(nums1);
        for (int i = 0; i < nums1.length; i++) {
            Assertions.assertArrayEquals(expect1[i], res1[i]);
        }
    }


    @Test
    public void solve02() {
        TransposeMatrix demo = new TransposeMatrix();

        int[][] nums1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expect1 = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}};

        int[][] res1 = demo.solve02(nums1);
        for (int i = 0; i < nums1.length; i++) {
            Assertions.assertArrayEquals(expect1[i], res1[i]);
        }
    }
}