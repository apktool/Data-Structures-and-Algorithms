package com.leetcode.demo.easy.dp;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordBreakTest {

    @Test
    public void solve01() {
        WordBreak demo = new WordBreak();

        String s1 = "leetcode";
        List<String> wordDict1 = List.of("leet", "code");
        boolean res1 = demo.solve01(s1, wordDict1);
        Assertions.assertTrue(res1);

        String s2 = "catsandog";
        List<String> wordDict2 = List.of("cats", "dog", "sand", "and", "cat");
        boolean res2 = demo.solve01(s2, wordDict2);
        Assertions.assertFalse(res2);
    }
}