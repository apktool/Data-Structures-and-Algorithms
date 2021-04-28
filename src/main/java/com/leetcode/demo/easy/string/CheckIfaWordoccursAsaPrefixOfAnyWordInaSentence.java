package com.leetcode.demo.easy.string;

public class CheckIfaWordoccursAsaPrefixOfAnyWordInaSentence {
    public int solve01(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            int index = s[i].indexOf(searchWord);
            if (index != -1 && index == 0) {
                return i + 1;
            }
        }

        return -1;
    }
}