package com.basic;

/**
 * @author apktool
 * @date 2018-06-24 21:57
 */

public class KMPStringMatching {
    private String pattern;
    private int[] next;

    public KMPStringMatching(String pattern) {
        this.pattern = pattern;
        int m = pattern.length();
        next = new int[m];

        int j = -1;
        for (int i = 0; i < m; i++) {
            if (i == 0) {
                next[i] = -1;
            } else if (pattern.charAt(i) != pattern.charAt(j)) {
                next[i] = j;
            } else {
                next[i] = next[j];
            }
            while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j];
            }
            j++;
        }

        for (int k = 0; k < m; k++) {
            System.out.println("next[" + k + "] = " + next[k]);
        }
    }

    public int search(String text) {
        int m = pattern.length();
        int n = text.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            while (j >= 0 && text.charAt(i) != pattern.charAt(j)) {
                j = next[j];
            }
            j++;
        }
        return j == m ? i - m : n;
    }


    public static void main(String[] args) {
        String pattern = "ABABAC";
        String text = "BCBAABACAABABACAA";

        int m = pattern.length();
        int n = text.length();

        KMPStringMatching kmp = new KMPStringMatching(pattern);
        int offset = kmp.search(text);

        System.out.println("m = " + m + ", n = " + n);
        System.out.println("offset: " + offset);
        System.out.println("text:    " + text);
        System.out.print("pattern: ");
        for (int i = 0; i < offset; i++) {
            System.out.print(" ");
        }
        System.out.println(pattern);
    }

}
