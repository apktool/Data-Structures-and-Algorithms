package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void solve01() {
        MaximumNumberOfBalloons demo = new MaximumNumberOfBalloons();

        String s1 = "nlaebolko";
        int expect1 = 1;
        int res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "leetcode";
        int expect2 = 0;
        int res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);
    }
}