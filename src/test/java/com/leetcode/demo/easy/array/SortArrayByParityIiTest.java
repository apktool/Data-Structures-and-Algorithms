package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayByParityIiTest {
    @Test
    public void solve01() {
        SortArrayByParityIi demo = new SortArrayByParityIi();

        int[] nums1 = {4, 2, 5, 7};
        int[] expect1 = {4, 5, 2, 7};
        int[] res1 = demo.solve01(nums1);
        Assertions.assertArrayEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        SortArrayByParityIi demo = new SortArrayByParityIi();

        int[] nums1 = {4, 2, 5, 7};
        int[] expect1 = {4, 5, 2, 7};
        int[] res1 = demo.solve02(nums1);
        Assertions.assertArrayEquals(expect1, res1);
    }
}