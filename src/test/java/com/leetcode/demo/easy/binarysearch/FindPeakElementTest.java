package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindPeakElementTest {

    @Test
    public void solve01() {
        FindPeakElement demo = new FindPeakElement();

        int[] nums1 = {1, 2, 3, 1};
        int expect1 = 2;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int expect2 = 5;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}