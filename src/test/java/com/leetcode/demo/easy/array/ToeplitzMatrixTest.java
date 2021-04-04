package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToeplitzMatrixTest {
    @Test
    public void solve01() {
        ToeplitzMatrix demo = new ToeplitzMatrix();

        int[][] nums1 = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        boolean res = demo.solve01(nums1);
        Assertions.assertEquals(true, res);
    }
}