package com.basic;

/**
 * @author apktool
 * @date 2018-05-29 21:37
 */
public class CombinationNum {
    public long factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

    public long combinationNum(int n, int m) {
        return (n > m) ? factorial(n) / factorial(n - m) / factorial(m) : 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        long result;

        CombinationNum haha = new CombinationNum();
        result = haha.combinationNum(n, m);
        System.out.println(result);
    }
}
