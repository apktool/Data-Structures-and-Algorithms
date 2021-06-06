package com.leetcode.demo.easy.dp;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestDivisibleSubsetTest {

    @Test
    public void solve01() {
        LargestDivisibleSubset demo = new LargestDivisibleSubset();

        int[] nums1 = {1, 2, 3};
        List<Integer> expect1 = Arrays.asList(2, 1);
        List<Integer> res1 = demo.solve01(nums1);
        Assertions.assertIterableEquals(res1, expect1);

        int[] nums2 = {1, 2, 4, 8};
        List<Integer> expect2 = Arrays.asList(8, 4, 2, 1);
        List<Integer> res2 = demo.solve01(nums2);
        Assertions.assertIterableEquals(res2, expect2);
    }
}