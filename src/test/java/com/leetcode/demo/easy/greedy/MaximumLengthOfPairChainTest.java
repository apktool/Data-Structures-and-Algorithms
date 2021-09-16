package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumLengthOfPairChainTest {

    @Test
    public void solve01() {
        MaximumLengthOfPairChain demo = new MaximumLengthOfPairChain();

        int[][] nums1 = {{1, 2}, {2, 3}, {3, 4}};
        int res1 = demo.solve01(nums1);
        int expect1 = 2;
        Assertions.assertEquals(expect1, res1);
    }
}