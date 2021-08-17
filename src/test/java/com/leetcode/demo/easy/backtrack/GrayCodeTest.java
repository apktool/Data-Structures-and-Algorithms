package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrayCodeTest {

    @Test
    public void solve01() {
        GrayCode demo = new GrayCode();

        int n1 = 2;
        List<Integer> res1 = demo.solve01(n1);
        Assertions.assertIterableEquals(List.of(0, 1, 3, 2), res1);

        int n2 = 3;
        List<Integer> res2 = demo.solve01(n2);
        Assertions.assertIterableEquals(List.of(0, 1, 3, 2, 6, 7, 5, 4), res2);
    }

    @Test
    public void solve02() {
        GrayCode demo = new GrayCode();

        int n1 = 2;
        List<Integer> res1 = demo.solve02(n1);
        Assertions.assertIterableEquals(List.of(0, 1, 3, 2), res1);

        int n2 = 3;
        List<Integer> res2 = demo.solve02(n2);
        Assertions.assertIterableEquals(List.of(0, 1, 3, 2, 6, 7, 5, 4), res2);
    }
}