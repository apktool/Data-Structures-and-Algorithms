package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductOfThreeNumbersTest {

    @Test
    public void solve01() {
        MaximumProductOfThreeNumbers demo = new MaximumProductOfThreeNumbers();
        int[] nums1 = {1, 2, 3, 4};
        int expect1 = 24;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}