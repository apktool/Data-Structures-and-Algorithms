package com.leetcode.demo.easy.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveKDigitsTest {

    @Test
    public void solve01() {
        RemoveKDigits demo = new RemoveKDigits();

        String nums1 = "1432219";
        int k1 = 3;
        String expect1 = "1219";
        String res1 = demo.solve01(nums1, k1);
        Assertions.assertEquals(expect1, res1);
    }
}