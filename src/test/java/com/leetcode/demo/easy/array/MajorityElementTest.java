package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    @Test
    public void solve01() {
        MajorityElement demo = new MajorityElement();

        int[] nums1 = {3, 2, 3};
        int expect1 = 3;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        MajorityElement demo = new MajorityElement();

        int[] nums1 = {3, 2, 3};
        int expect1 = 3;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve03() {
        MajorityElement demo = new MajorityElement();

        int[] nums1 = {3, 2, 3};
        int expect1 = 3;
        int res1 = demo.solve03(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}