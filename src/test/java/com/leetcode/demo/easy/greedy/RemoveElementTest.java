package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test
    public void solve01() {
        RemoveElement demo = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expect1 = 2;
        int res1 = demo.solve01(nums1, val1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int expect2 = 5;
        int res2 = demo.solve01(nums2, val2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        RemoveElement demo = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expect1 = 2;
        int res1 = demo.solve02(nums1, val1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int expect2 = 5;
        int res2 = demo.solve02(nums2, val2);
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve03() {
        RemoveElement demo = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expect1 = 2;
        int res1 = demo.solve03(nums1, val1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int expect2 = 5;
        int res2 = demo.solve03(nums2, val2);
        Assertions.assertEquals(expect2, res2);
    }
}