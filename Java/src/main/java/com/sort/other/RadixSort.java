package com.sort.other;

import java.util.Arrays;

/**
 * @author apktool
 * @date 2018-06-04 22:35
 * *
 * Radix Sort
 * *
 * https://www.geeksforgeeks.org/radix-sort/
 */
public class RadixSort {
    public void radixSort(int[] numbers) {
        int m = getMax(numbers);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(numbers, exp);
        }
    }

    private int getMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private void countSort(int[] numbers, int exp) {
        int n = numbers.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(numbers[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(numbers[i] / exp % 10)] - 1] = numbers[i];
            count[numbers[i] / exp % 10]--;
        }

        for (int i = 0; i < n; i++) {
            numbers[i] = output[i];
        }
    }

    public void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {49, 38, 65, 97, 76, 13, 27, 49};
        RadixSort rs = new RadixSort();
        rs.radixSort(numbers);
        rs.display(numbers);
    }
}
