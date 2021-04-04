package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestNumberAtLeastTwiceOfOthersTest {
    @Test
    public void solve01() {
        LargestNumberAtLeastTwiceOfOthers demo = new LargestNumberAtLeastTwiceOfOthers();

        int[] nums1 = {3, 6, 1, 0};
        int expect1 = 1;
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(expect1, res1);
    }

    @Test
    public void solve02() {
        LargestNumberAtLeastTwiceOfOthers demo = new LargestNumberAtLeastTwiceOfOthers();

        int[] nums1 = {3, 6, 1, 0};
        int expect1 = 1;
        int res1 = demo.solve02(nums1);
        Assertions.assertEquals(expect1, res1);
    }
}