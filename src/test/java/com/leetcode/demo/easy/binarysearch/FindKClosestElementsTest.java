package com.leetcode.demo.easy.binarysearch;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindKClosestElementsTest {

    @Test
    public void solve01() {
        FindKClosestElements demo = new FindKClosestElements();
        int[] nums1 = {1, 2, 3, 4, 5};
        int k1 = 4;
        int x1 = 3;
        List<Integer> res1 = demo.solve01(nums1, k1, x1);
        Assertions.assertIterableEquals(List.of(1, 2, 3, 4), res1);

        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 4;
        int x2 = -1;
        List<Integer> res2 = demo.solve01(nums2, k2, x2);
        Assertions.assertIterableEquals(List.of(1, 2, 3, 4), res2);
    }
}