package com.leetcode.demo.easy.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDuplicateNumberTest {

    @Test
    public void solve01() {
        FindTheDuplicateNumber demo = new FindTheDuplicateNumber();

        int[] nums1 = {1, 3, 4, 2, 2};
        int res1 = demo.solve01(nums1);
        int expect1 = 2;
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {3, 1, 3, 4, 2};
        int res2 = demo.solve01(nums2);
        int expect2 = 3;
        Assertions.assertEquals(expect2, res2);
    }

    @Test
    public void solve02() {
        FindTheDuplicateNumber demo = new FindTheDuplicateNumber();

        int[] nums1 = {1, 3, 4, 2, 2};
        int res1 = demo.solve02(nums1);
        int expect1 = 2;
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {3, 1, 3, 4, 2};
        int res2 = demo.solve02(nums2);
        int expect2 = 3;
        Assertions.assertEquals(expect2, res2);
    }

}