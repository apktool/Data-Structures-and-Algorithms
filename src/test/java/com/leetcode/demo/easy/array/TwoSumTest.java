package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    public void solve01() {
        TwoSum demo = new TwoSum();

        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 6;
        int[] res1 = {1, 3};
        int[] res = demo.solve01(nums1, target1);
        Assertions.assertArrayEquals(res1, res);
    }

    @Test
    public void solve02() {
        TwoSum demo = new TwoSum();

        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 6;
        int[] res1 = {1, 3};
        int[] res = demo.solve02(nums1, target1);
        Assertions.assertArrayEquals(res1, res);
    }
}