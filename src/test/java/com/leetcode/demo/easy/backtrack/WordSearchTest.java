package com.leetcode.demo.easy.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {

    @Test
    public void solve01() {
        WordSearch demo = new WordSearch();

        char[][] board1 = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word1 = "ABCCED";
        boolean res1 = demo.solve01(board1, word1);
        Assertions.assertTrue(res1);

        char[][] board2 = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word2 = "ABCB";
        boolean res2 = demo.solve01(board2, word2);
        Assertions.assertFalse(res2);
    }
}