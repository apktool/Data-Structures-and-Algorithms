package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum2InputArrayIsSortedTest {
    @Test
    public void solve01() {
        TwoSum2InputArrayIsSorted demo = new TwoSum2InputArrayIsSorted();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res1 = {1, 2};
        int[] res = demo.solve01(nums1, target1);
        Assertions.assertArrayEquals(res1, res);
    }
}