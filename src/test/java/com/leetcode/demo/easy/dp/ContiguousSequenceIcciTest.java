package com.leetcode.demo.easy.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContiguousSequenceIcciTest {

    @Test
    public void solve01() {
        ContiguousSequenceIcci demo = new ContiguousSequenceIcci();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = demo.solve01(nums);
        int expect = 6;

        Assertions.assertEquals(expect, res);
    }
}