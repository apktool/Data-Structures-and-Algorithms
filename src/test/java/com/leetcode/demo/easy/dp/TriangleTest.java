package com.leetcode.demo.easy.dp;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void solve01() {
        Triangle demo = new Triangle();

        List<List<Integer>> lists1 = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        int expect1 = 11;
        int res1 = demo.solve01(lists1);
        Assertions.assertEquals(expect1, res1);

        List<List<Integer>> lists2 = Arrays.asList(Arrays.asList(-10));
        int expect2 = -10;
        int res2 = demo.solve01(lists2);
        Assertions.assertEquals(expect2, res2);
    }
}