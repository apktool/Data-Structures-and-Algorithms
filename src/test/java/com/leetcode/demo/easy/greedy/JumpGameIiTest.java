package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JumpGameIiTest {

    @Test
    public void solve01() {
        JumpGameIi demo = new JumpGameIi();

        int[] nums1 = {2, 3, 1, 1, 4};
        int res1 = demo.solve01(nums1);
        Assertions.assertEquals(2, res1);
    }
}