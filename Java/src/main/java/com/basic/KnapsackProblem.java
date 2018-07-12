package com.basic;

/**
 * @author apktool
 * @date 2018-07-08 16:28
 * *
 * 01 背包问题
 */
public class KnapsackProblem {

    private int knapSack(int[] w, int[] v, int capacity) {
        int[][] p = new int[w.length + 1][capacity + 1];
        /**
         * 注意，这里的w[i - 1] 和 v[i - 1]仅仅只是为了下标对应，因为p[0][j] 和 p[i][0] 应该是为0的
         */
        for (int i = 1; i < w.length + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (j < w[i - 1]) {
                    p[i][j] = p[i - 1][j];
                } else {
                    p[i][j] = Math.max(p[i - 1][j], p[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }

        return p[w.length][capacity];
    }


    public static void main(String[] args) {
        int[] w = {2, 3, 4, 5};
        int[] v = {3, 4, 5, 6};
        int capacity = 8;
        int values;

        KnapsackProblem kp = new KnapsackProblem();
        values = kp.knapSack(w, v, capacity);
        System.out.println(values);
    }
}
