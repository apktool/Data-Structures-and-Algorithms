package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    @Test
    public void solve01() {
        ContainsDuplicate demo = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        boolean expect1 = true;
        boolean res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        ContainsDuplicate demo = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        boolean expect1 = true;
        boolean res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}