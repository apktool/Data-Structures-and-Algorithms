package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateParenthesesTest {

    @Test
    public void solve01() {
        GenerateParentheses demo = new GenerateParentheses();

        Integer n = 3;
        demo.solve01(n);
        List<String> expect1 = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> res1 = demo.solve01(n);
        Assertions.assertIterableEquals(expect1, res1);
    }
}