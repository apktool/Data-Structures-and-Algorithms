package com.leetcode.demo.easy.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditiveNumberTest {

    @Test
    public void solve01() {
        AdditiveNumber demo = new AdditiveNumber();

        String num1 = "112358";
        boolean res1 = demo.solve01(num1);
        Assertions.assertTrue(res1);

        String num2 = "199100199";
        boolean res2 = demo.solve01(num2);
        Assertions.assertTrue(res2);
    }
}