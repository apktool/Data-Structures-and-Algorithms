package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void solve01() {
        FindAllNumbersDisappearedInAnArray demo = new FindAllNumbersDisappearedInAnArray();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expect1 = Arrays.asList(5, 6);
        List<Integer> res1 = demo.solve01(nums1);
        Assertions.assertIterableEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        FindAllNumbersDisappearedInAnArray demo = new FindAllNumbersDisappearedInAnArray();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expect1 = Arrays.asList(5, 6);
        List<Integer> res1 = demo.solve02(nums1);
        Assertions.assertIterableEquals(expect1, res1);
    }
}