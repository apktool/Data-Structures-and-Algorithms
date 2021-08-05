package com.leetcode.demo.easy.backtrack;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCombinationsOfAphoneNumberTest {

    @Test
    public void solve01() {
        LetterCombinationsOfAphoneNumber demo = new LetterCombinationsOfAphoneNumber();

        String s1 = "23";
        List<String> expect1 = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> res1 = demo.solve01(s1);
        Assertions.assertIterableEquals(expect1, res1);
    }
}