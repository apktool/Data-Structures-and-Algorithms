package com.basic;

/**
 * @author apktool
 * @date 2018-05-29 20:50
 */
public class PermutationNum {
    private long factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    private long permutationNum(int n, int m) {
        return (n >= m) ? factorial(n) / factorial(n - m) : 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        long result;

        PermutationNum haha = new PermutationNum();
        result = haha.permutationNum(n, m);

        System.out.println(result);
    }
}
