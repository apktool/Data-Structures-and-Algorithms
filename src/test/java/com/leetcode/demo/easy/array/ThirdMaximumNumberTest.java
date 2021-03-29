package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThirdMaximumNumberTest {
    @Test
    public void solve01() {
        ThirdMaximumNumber demo = new ThirdMaximumNumber();

        int[] nums1 = {1, 2, 3, 4, 5};
        int res1 = 3;
        int res = demo.solve01(nums1);
        Assertions.assertEquals(res1, res);
    }
}