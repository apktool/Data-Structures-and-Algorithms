package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    @Test
    public void solve01() {
        SearchInsertPosition demo = new SearchInsertPosition();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int res1 = 2;
        int res = demo.solve01(nums1, target1);
        Assertions.assertEquals(res1, res);

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int res2 = 1;
        res = demo.solve01(nums2, target2);
        Assertions.assertEquals(res2, res);

        int[] nums3 = {1};
        int target3 = 1;
        int res3 = 0;
        res = demo.solve01(nums3, target3);
        Assertions.assertEquals(res3, res);
    }
}