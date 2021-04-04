package com.leetcode.demo.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitCharactersTest {

    @Test
    public void solve01() {
        BitCharacters demo = new BitCharacters();

        int[] nums1 = {1, 0, 0};
        boolean res1 = demo.solve01(nums1);
        Assertions.assertEquals(true, res1);

        int[] nums2 = {1, 1, 1, 0};
        boolean res2 = demo.solve01(nums2);
        Assertions.assertEquals(false, res2);
    }
}