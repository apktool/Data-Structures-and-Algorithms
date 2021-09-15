package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidTriangleNumberTest {

    @Test
    public void solve01() {
        ValidTriangleNumber demo = new ValidTriangleNumber();

        int[] nums1 = {2, 2, 3, 4};
        int res1 = demo.solve01(nums1);
        int expect1 = 3;
        Assertions.assertEquals(expect1, res1);
    }
}