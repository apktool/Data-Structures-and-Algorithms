package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumScoreAfterSplittingAStringTest {

    @Test
    public void solve01() {
        MaximumScoreAfterSplittingAString demo = new MaximumScoreAfterSplittingAString();

        String s1 = "011101";
        Integer expect1 = 5;
        Integer res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "00111";
        Integer expect2 = 5;
        Integer res2 = demo.solve01(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "00";
        Integer expect3 = 1;
        Integer res3 = demo.solve01(s3);
        Assertions.assertEquals(expect3, res3);

        String s4 = "1111";
        Integer expect4 = 3;
        Integer res4 = demo.solve01(s4);
        Assertions.assertEquals(expect4, res4);
    }

    @Test
    public void solve02() {
        MaximumScoreAfterSplittingAString demo = new MaximumScoreAfterSplittingAString();

        String s1 = "011101";
        Integer expect1 = 5;
        Integer res1 = demo.solve02(s1);
        Assertions.assertEquals(expect1, res1);

        String s2 = "00111";
        Integer expect2 = 5;
        Integer res2 = demo.solve02(s2);
        Assertions.assertEquals(expect2, res2);

        String s3 = "00";
        Integer expect3 = 1;
        Integer res3 = demo.solve02(s3);
        Assertions.assertEquals(expect3, res3);

        String s4 = "1111";
        Integer expect4 = 3;
        Integer res4 = demo.solve02(s4);
        Assertions.assertEquals(expect4, res4);
    }
}