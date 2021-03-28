package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void solve01() {
        BestTimeToBuyAndSellStock demo = new BestTimeToBuyAndSellStock();

        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int expect1 = 5;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}