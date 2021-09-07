package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestNumberTest {

    @Test
    public void solve01() {
        LargestNumber demo = new LargestNumber();

        int[] nums1 = {10, 2};
        String res1 = demo.solve01(nums1);
        Assertions.assertEquals("210", res1);

        int[] nums2 = {3, 30, 34, 5, 9};
        String res2 = demo.solve01(nums2);
        Assertions.assertEquals("9534330", res2);
    }
}