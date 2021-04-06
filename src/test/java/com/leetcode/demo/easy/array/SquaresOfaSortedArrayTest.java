package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquaresOfaSortedArrayTest {

    @Test
    public void solve01() {
        SquaresOfaSortedArray demo = new SquaresOfaSortedArray();

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] expect1 = {0, 1, 9, 16, 100};
        int[] res1 = demo.solve01(nums1);
        Assertions.assertArrayEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        SquaresOfaSortedArray demo = new SquaresOfaSortedArray();

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] expect1 = {0, 1, 9, 16, 100};
        int[] res1 = demo.solve02(nums1);
        Assertions.assertArrayEquals(expect1, res1);
    }

    @Test
    public void solve03() {
        SquaresOfaSortedArray demo = new SquaresOfaSortedArray();

        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] expect1 = {0, 1, 9, 16, 100};
        int[] res1 = demo.solve03(nums1);
        Assertions.assertArrayEquals(expect1, res1);
    }
}