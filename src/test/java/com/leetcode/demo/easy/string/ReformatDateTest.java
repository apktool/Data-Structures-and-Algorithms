package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReformatDateTest {

    @Test
    public void solve01() {
        ReformatDate demo = new ReformatDate();

        String s1 = "20th Oct 2052";
        String expect1 = "2052-10-20";
        String res1 = demo.solve01(s1);
        Assertions.assertEquals(expect1, res1);
    }
}