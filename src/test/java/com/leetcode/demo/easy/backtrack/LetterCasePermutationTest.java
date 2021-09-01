package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCasePermutationTest {

    @Test
    public void solve01() {
        LetterCasePermutation demo = new LetterCasePermutation();

        String s1 = "a1b2";
        List<String> res1 = demo.solve01(s1);
        Assertions.assertIterableEquals(List.of("a1b2", "A1b2", "A1B2", "a1B2"), res1);

        String s2 = "12345";
        List<String> res2 = demo.solve01(s2);
        Assertions.assertIterableEquals(List.of("12345"), res2);
    }
}