package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPivotIndexTest {

    @Test
    public void solve01() {
        FindPivotIndex demo = new FindPivotIndex();

        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int expect1 = 3;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 3};
        int expect2 = -1;
        int res2 = demo.solve01(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {2, 1, -1};
        int expect3 = 0;
        int res3 = demo.solve01(nums3);
        Assertions.assertEquals(expect3, res3);

        int[] nums4 = {-1, -1, -1, 1, 1, 1};
        int expect4 = -1;
        int res4 = demo.solve01(nums4);
        Assertions.assertEquals(expect4, res4);
    }

    @Test
    public void solve02() {
        FindPivotIndex demo = new FindPivotIndex();

        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int expect1 = 3;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);

        int[] nums2 = {1, 2, 3};
        int expect2 = -1;
        int res2 = demo.solve02(nums2);
        Assertions.assertEquals(expect2, res2);

        int[] nums3 = {2, 1, -1};
        int expect3 = 0;
        int res3 = demo.solve02(nums3);
        Assertions.assertEquals(expect3, res3);

        int[] nums4 = {-1, -1, -1, 1, 1, 1};
        int expect4 = -1;
        int res4 = demo.solve02(nums4);
        Assertions.assertEquals(expect4, res4);
    }
}