package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayPartitionITest {

    @Test
    public void solve01() {
        ArrayPartitionI demo = new ArrayPartitionI();

        int[] nums1 = {1, 4, 3, 2};
        int expect1 = 4;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}