package com.leetcode.demo.easy.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReorderDataInLogFilesTest {

    @Test
    public void solve01() {
        ReorderDataInLogFiles demo = new ReorderDataInLogFiles();

        String[] str1 = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] expect1 = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};
        String[] res1 = demo.solve01(str1);
        Assertions.assertArrayEquals(expect1, res1);

        String[] str2 = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        String[] expect2 = {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
        String[] res2 = demo.solve01(str2);
        Assertions.assertArrayEquals(expect2, res2);
    }
}