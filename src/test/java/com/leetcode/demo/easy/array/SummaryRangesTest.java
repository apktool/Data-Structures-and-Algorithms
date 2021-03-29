package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummaryRangesTest {
    @Test
    public void solve01() {
        SummaryRanges demo = new SummaryRanges();

        int[] nums1 = {0, 1, 2, 4, 5, 7};
        List<String> expect1 = Arrays.asList("0->2", "4->5", "7");
        List<String> res = demo.solve01(nums1);
        Assertions.assertIterableEquals(expect1, res);
    }
}