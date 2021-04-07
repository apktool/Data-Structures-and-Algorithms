package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfEvenNumbersAfterQueriesTest {

    @Test
    public void solve01() {
        SumOfEvenNumbersAfterQueries demo = new SumOfEvenNumbersAfterQueries();

        int[] nums1 = {1, 2, 3, 4};
        int[][] nums2 = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] expect = {8, 6, 2, 4};
        int[] res = demo.solve01(nums1, nums2);
        Assertions.assertArrayEquals(res, expect);
    }

    @Test
    public void solve02() {
        SumOfEvenNumbersAfterQueries demo = new SumOfEvenNumbersAfterQueries();

        int[] nums1 = {1, 2, 3, 4};
        int[][] nums2 = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] expect = {8, 6, 2, 4};
        int[] res = demo.solve02(nums1, nums2);
        Assertions.assertArrayEquals(res, expect);
    }

    @Test
    public void solve03() {
        SumOfEvenNumbersAfterQueries demo = new SumOfEvenNumbersAfterQueries();

        int[] nums1 = {1, 2, 3, 4};
        int[][] nums2 = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] expect = {8, 6, 2, 4};
        int[] res = demo.solve03(nums1, nums2);
        Assertions.assertArrayEquals(res, expect);
    }
}