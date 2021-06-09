package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumIvTest {

    @Test
    public void solve01() {
        CombinationSumIv demo = new CombinationSumIv();

        int[] nums1 = {1, 2, 3};
        int target1 = 4;
        int expect1 = 7;
        int res1 = demo.solve01(nums1, target1);
        Assertions.assertEquals(res1, expect1);

        int[] nums2 = {9};
        int target2 = 3;
        int expect2 = 0;
        int res2 = demo.solve01(nums2, target2);
        Assertions.assertEquals(res2, expect2);
    }
}