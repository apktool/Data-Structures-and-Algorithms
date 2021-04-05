package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlippingAnImageTest {
    @Test
    public void solve01() {
        FlippingAnImage demo = new FlippingAnImage();

        int[][] nums1 = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] expect1 = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};

        int[][] res1 = demo.solve01(nums1);
        for (int i = 0; i < nums1.length; i++) {
            Assertions.assertArrayEquals(expect1[i], res1[i]);
        }
    }

    @Test
    public void solve02() {
        FlippingAnImage demo = new FlippingAnImage();

        int[][] nums1 = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };

        int[][] expect1 = {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 1, 0}
        };

        int[][] res1 = demo.solve02(nums1);
        for (int i = 0; i < nums1.length; i++) {
            Assertions.assertArrayEquals(expect1[i], res1[i]);
        }
    }
}