package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {

    @Test
    public void solve01() {
        ValidMountainArray demo = new ValidMountainArray();

        int[] nums1 = {0, 3, 2, 1};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertEquals(true, res1);
    }

    @Test
    public void solve02() {
        ValidMountainArray demo = new ValidMountainArray();

        int[] nums1 = {0, 3, 2, 1};
        boolean res1 = demo.solve02(nums1);
        Assertions.assertEquals(true, res1);
    }
}