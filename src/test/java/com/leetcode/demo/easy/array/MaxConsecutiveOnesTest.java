package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void solve01() {
        MaxConsecutiveOnes demo = new MaxConsecutiveOnes();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int expect1 = 3;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        MaxConsecutiveOnes demo = new MaxConsecutiveOnes();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int expect1 = 3;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}