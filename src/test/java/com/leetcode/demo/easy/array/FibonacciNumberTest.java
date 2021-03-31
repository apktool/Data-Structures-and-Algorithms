package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {

    @Test
    public void solve01() {
        FibonacciNumber demo = new FibonacciNumber();
        int nums1 = 3;
        int expect1 = 2;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        FibonacciNumber demo = new FibonacciNumber();
        int nums1 = 3;
        int expect1 = 2;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}