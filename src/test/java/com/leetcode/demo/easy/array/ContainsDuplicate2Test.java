package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate2Test {
    @Test
    public void solve01() {
        ContainsDuplicate2 demo = new ContainsDuplicate2();

        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        boolean expect1 = true;
        boolean res1 = demo.solve01(nums1, k1);
        Assertions.assertEquals(expect1, res1);


        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        boolean expect2 = true;
        boolean res2 = demo.solve01(nums2, k2);
        Assertions.assertEquals(expect2, res2);
    }
}