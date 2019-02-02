package com.basic;

// https://www.cnblogs.com/yjiyjige/p/3263858.html

public class KMPStringMatchingII {

    // 暴力匹配
    public int findStringByStupidWay(String str, String pattern) {
        int i = 0;
        int j = 0;

        while (i < str.length() && j < pattern.length()) {
            if (str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        if (j == pattern.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    // KMP匹配
    public int findStringByKMP(String str, String pattern) {
        int i = 0;
        int j = 0;

        int[] next = getNextArray(pattern);

        while (i < str.length() && j < pattern.length()) {
            if (j == -1 || str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == pattern.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] getNextArray(String pattern) {
        int[] next = new int[pattern.length()];
        next[0] = -1;

        int j = 0;
        int k = -1;

        while (j < pattern.length() - 1) {
            if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }

        return next;
    }

    public static void main(String[] args) {
        String str = "BCBAABACAABABACAA";
        String pattern = "ABABAC";

        KMPStringMatchingII ks = new KMPStringMatchingII();
        int offset = 0;

        offset = ks.findStringByStupidWay(str, pattern);
        System.out.println("offset: " + offset);

        offset = ks.findStringByKMP(str, pattern);
        System.out.println("offset: " + offset);

        System.out.println("=============================");

        System.out.print("next:    ");
        int[] next = ks.getNextArray(pattern);
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }
        System.out.println();

        System.out.println("=============================");

        System.out.print("str:     ");
        System.out.println(str);

        System.out.print("pattern: ");
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }
        System.out.println(pattern);

    }
}
