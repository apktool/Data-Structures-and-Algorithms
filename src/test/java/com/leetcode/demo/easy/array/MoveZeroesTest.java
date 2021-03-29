package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    @Test
    public void solve01() {
        MoveZeroes demo = new MoveZeroes();

        int[] nums1 = {0, 1, 0, 3, 12};
        int[] expect1 = {1, 3, 12, 0, 0};
        demo.solve01(nums1);
        Assertions.assertArrayEquals(expect1, nums1);
    }

    @Test
    public void solve02() {
        MoveZeroes demo = new MoveZeroes();

        int[] nums1 = {0, 1, 0, 3, 12};
        int[] expect1 = {1, 3, 12, 0, 0};
        demo.solve02(nums1);
        Assertions.assertArrayEquals(expect1, nums1);
    }
}