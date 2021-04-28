package com.leetcode.demo.easy.string;

public class ConsecutiveCharacters {
    public int solve01(String s) {
        int res = Integer.MIN_VALUE;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                res = Math.max(res, max);
                max = 1;
            } else {
                max++;
            }
        }

        return Math.max(res, max);
    }
}
