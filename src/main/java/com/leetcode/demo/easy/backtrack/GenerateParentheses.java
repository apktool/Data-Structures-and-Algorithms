package com.leetcode.demo.easy.backtrack;

import java.util.LinkedList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */

public class GenerateParentheses {
    public List<String> solve01(int n) {
        List<String> list = new LinkedList<>();
        backtrack(list, new StringBuffer(), 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, StringBuffer buffer, int open, int close, int n) {
        if (buffer.length() == n * 2) {
            list.add(buffer.toString());
            return;
        }

        if (open < n) {
            buffer.append("(");
            backtrack(list, buffer, open + 1, close, n);
            buffer.deleteCharAt(buffer.length() - 1);
        }

        if (close < open) {
            buffer.append(")");
            backtrack(list, buffer, open, close + 1, n);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
}
