package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetectCapitalTest {

    @Test
    public void solve01() {
        DetectCapital demo = new DetectCapital();

        String s1 = "USA";
        boolean res1 = demo.solve01(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "HBase";
        boolean res2 = demo.solve01(s2);
        Assertions.assertEquals(false, res2);

        String s3 = "Leetcode";
        boolean res3 = demo.solve01(s3);
        Assertions.assertEquals(true, res3);
    }

    @Test
    public void solve02() {
        DetectCapital demo = new DetectCapital();

        String s1 = "USA";
        boolean res1 = demo.solve02(s1);
        Assertions.assertEquals(true, res1);

        String s2 = "HBase";
        boolean res2 = demo.solve02(s2);
        Assertions.assertEquals(false, res2);

        String s3 = "Leetcode";
        boolean res3 = demo.solve02(s3);
        Assertions.assertEquals(true, res3);
    }
}