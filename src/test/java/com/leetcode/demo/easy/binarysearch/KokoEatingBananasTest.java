package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

    @Test
    public void solve01() {
        KokoEatingBananas demo = new KokoEatingBananas();

        int[] nums1 = {3, 6, 7, 11};
        int h1 = 8;
        int expect1 = 4;
        int res1 = demo.solve01(nums1, h1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {30, 11, 23, 4, 20};
        int h2 = 6;
        int expect2 = 23;
        int res2 = demo.solve01(nums2, h2);
        Assertions.assertEquals(expect2, res2);
    }
}