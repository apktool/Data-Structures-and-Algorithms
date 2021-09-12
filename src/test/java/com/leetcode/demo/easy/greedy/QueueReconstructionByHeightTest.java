package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueReconstructionByHeightTest {

    @Test
    public void solve01() {
        QueueReconstructionByHeight demo = new QueueReconstructionByHeight();

        int[][] nums = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] res = demo.solve01(nums);
        Assertions.assertArrayEquals(new int[]{5, 0}, res[0]);
        Assertions.assertArrayEquals(new int[]{7, 0}, res[1]);
        Assertions.assertArrayEquals(new int[]{5, 2}, res[2]);
        Assertions.assertArrayEquals(new int[]{6, 1}, res[3]);
        Assertions.assertArrayEquals(new int[]{4, 4}, res[4]);
        Assertions.assertArrayEquals(new int[]{7, 1}, res[5]);
    }
}