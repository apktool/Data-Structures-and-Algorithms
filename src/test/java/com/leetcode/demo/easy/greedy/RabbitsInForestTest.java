package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RabbitsInForestTest {

    @Test
    public void solve01() {
        RabbitsInForest demo = new RabbitsInForest();

        int[] arr1 = {1, 1, 2};
        int expect1 = 5;
        int res1 = demo.solve01(arr1);
        Assertions.assertEquals(expect1, res1);

        int[] arr2 = {10, 10, 10};
        int expect2 = 11;
        int res2 = demo.solve01(arr2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        RabbitsInForest demo = new RabbitsInForest();

        int[] arr1 = {1, 1, 2};
        int expect1 = 5;
        int res1 = demo.solve02(arr1);
        Assertions.assertEquals(expect1, res1);

        int[] arr2 = {10, 10, 10};
        int expect2 = 11;
        int res2 = demo.solve02(arr2);
        Assertions.assertEquals(expect2, res2);
    }
}