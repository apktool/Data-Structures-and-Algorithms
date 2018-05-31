package com.basic;

/**
 * @author apktool
 * @date 2018-05-29 21:51
 * *
 * Given an array of size n, generate and print all possible combinations of r elements in array.
 *
 * example:
 *
 * if input array is {1, 2, 3, 4} and r is 2,
 * then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
 *
 * https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
 */
public class Combination {
    private void combination(String[] array, int n, int m) {
        String[] data = new String[m];
        combinationHelper(array, data, 0, n, 0, m);
    }

    private void combinationHelper(String[] array, String[] data, int start, int end, int index, int r) {
        if (index == r) {
            display(data);
            return;
        }

        for (int i = start; i < end && end - i >= r - index; i++) {
            data[index] = array[i];
            combinationHelper(array, data, i + 1, end, index + 1, r);
        }
    }

    private void display(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s ", data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E"};
        int n = array.length;
        int m = 3;

        Combination haha = new Combination();
        haha.combination(array, n, m);
    }
}
