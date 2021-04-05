package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayByParityTest {
    @Test
    public void solve01() {
        SortArrayByParity demo = new SortArrayByParity();

        int[] nums1 = {3, 1, 2, 4};
        int[] expect1 = {4, 2, 1, 3};
        int[] res1 = demo.solve01(nums1);
        Assertions.assertArrayEquals(expect1, res1);
    }
}