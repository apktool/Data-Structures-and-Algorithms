package com.leetcode.demo.easy.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchsticksToSquareTest {

    @Test
    public void solve01() {
        MatchsticksToSquare demo = new MatchsticksToSquare();

        int[] nums1 = {1, 1, 2, 2, 2};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertTrue(res1);

        int[] nums2 = {1, 1, 2, 2, 2};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertTrue(res2);
    }
}