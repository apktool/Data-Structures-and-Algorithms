package com.leetcode.demo.easy.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int solve01(String[] arr) {
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        Set<String> sets = new HashSet<>();
        for (String str : arr) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                int idx = str.charAt(i) - 'a';
                builder.append(morse[idx]);
            }
            sets.add(builder.toString());
        }

        return sets.size();
    }
}
