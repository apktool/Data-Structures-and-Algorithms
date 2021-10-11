package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KthSmallestElementInAsortedMatrixTest {

    @Test
    public void solve01() {
        KthSmallestElementInAsortedMatrix demo = new KthSmallestElementInAsortedMatrix();

        int[][] nums1 = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k1 = 8;
        int expect1 = 13;
        int res1 = demo.solve01(nums1, k1);
        Assertions.assertEquals(expect1, res1);

        int[][] nums2 = {{-5}};
        int k2 = 1;
        int expect2 = -5;
        int res2 = demo.solve01(nums2, k2);
        Assertions.assertEquals(expect2, res2);

        int[][] nums3 = {{-5, -4}, {-5, -4}};
        int k3 = 2;
        int expect3 = -5;
        int res3 = demo.solve01(nums3, k3);
        Assertions.assertEquals(expect3, res3);
    }
}