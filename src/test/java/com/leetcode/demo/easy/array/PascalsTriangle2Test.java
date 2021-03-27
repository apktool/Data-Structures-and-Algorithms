package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalsTriangle2Test {

    @Test
    public void solve01() {
        PascalsTriangle2 demo = new PascalsTriangle2();

        int rowIndex = 3;
        List<Integer> expect1 = Arrays.asList(1, 3, 3, 1);
        List<Integer> res1 = demo.solve01(rowIndex);
        System.out.println(res1);
        Assertions.assertIterableEquals(expect1, res1);
    }
}