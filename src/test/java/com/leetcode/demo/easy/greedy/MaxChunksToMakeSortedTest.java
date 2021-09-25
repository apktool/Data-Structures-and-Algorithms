package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxChunksToMakeSortedTest {

    @Test
    public void solve01() {
        MaxChunksToMakeSorted demo = new MaxChunksToMakeSorted();

        int[] arr1 = {4, 3, 2, 1, 0};
        int expect1 = 1;
        int res1 = demo.solve01(arr1);
        Assertions.assertEquals(expect1, res1);

        int[] arr2 = {1, 0, 2, 3, 4};
        int expect2 = 4;
        int res2 = demo.solve01(arr2);
        Assertions.assertEquals(expect2, res2);
    }
}