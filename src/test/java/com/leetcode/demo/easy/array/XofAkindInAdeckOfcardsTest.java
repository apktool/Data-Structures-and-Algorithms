package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XofAkindInAdeckOfcardsTest {

    @Test
    public void solve01() {
        XofAkindInAdeckOfcards demo = new XofAkindInAdeckOfcards();
        int[] nums1 = {1, 2, 3, 4, 4, 3, 2, 1};
        boolean res = demo.solve01(nums1);
        Assertions.assertEquals(true, res);
    }
}