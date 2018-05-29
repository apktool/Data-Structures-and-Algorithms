package com.basic;

/**
 * @author apktool
 * @date 2018-05-29 20:56
 * *
 * A permutation, also called an “arrangement number” or “order,”
 * is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself.
 * A string of length n has n! permutation.
 *
 * Example:
 *
 * Below are the permutations of string ABC.
 * ABC ACB BAC BCA CBA CAB
 *
 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */
public class Permutation {
    public void permutation(String[] array) {
        permutationHelper(array, 0, array.length);
    }

    public void permutationHelper(String[] array, int left, int right) {
        if(left == right) {
            display(array);
        } else {
            for (int i = left; i < right; i++) {
                swap(array, left, i);
                permutationHelper(array, left + 1, right);
                swap(array, left, i);
            }
        }
    }

    public void swap(String[] array, int left, int right) {
        String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};

        Permutation haha = new Permutation();
        haha.permutation(array);
    }
}
