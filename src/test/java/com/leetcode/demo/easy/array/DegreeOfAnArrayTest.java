package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DegreeOfAnArrayTest {

    @Test
    public void solve01() {
        DegreeOfAnArray demo = new DegreeOfAnArray();

        int[] nums1 = {1, 2, 2, 3, 1};
        int expect1 = 2;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1};
        int expect2 = 1;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        DegreeOfAnArray demo = new DegreeOfAnArray();

        int[] nums1 = {1, 2, 2, 3, 1};
        int expect1 = 2;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1};
        int expect2 = 1;
        int res2 = demo.solve02(nums2);
        Assertions.assertEquals(expect2, res2);
    }
}