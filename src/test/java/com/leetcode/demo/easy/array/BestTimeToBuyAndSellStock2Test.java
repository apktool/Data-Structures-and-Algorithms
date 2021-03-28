package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock2Test {
    @Test
    public void solve01() {
        BestTimeToBuyAndSellStock2 demo = new BestTimeToBuyAndSellStock2();

        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int expect1 = 7;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        BestTimeToBuyAndSellStock2 demo = new BestTimeToBuyAndSellStock2();

        int[] nums1 = {7, 1, 5, 3, 6, 4};
        int expect1 = 7;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}