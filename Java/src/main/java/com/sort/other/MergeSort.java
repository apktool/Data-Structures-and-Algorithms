package com.sort.other;

/**
 * @author apktool
 * @date 2018-06-04 22:15
 * *
 * MergeSort
 */
public class MergeSort {
    public void mergeSort(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }
        sort(numbers, 0, numbers.length - 1);
    }

    private void sort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;
        sort(numbers, left, middle);
        sort(numbers, middle + 1, right);

        merge(numbers, left, middle, right);
    }

    private void merge(int[] numbers, int left, int middle, int right) {
        int len1 = middle - left + 1;
        int len2 = right - middle;

        int L[] = new int[len1];
        int R[] = new int[len2];

        for (int i = 0; i < len1; i++) {
            L[i] = numbers[left + i];
        }

        for (int j = 0; j < len2; j++) {
            R[j] = numbers[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (L[i] <= R[j]) {
                numbers[k++] = L[i++];
            } else {
                numbers[k++] = R[j++];
            }
        }

        while (i < len1) {
            numbers[k++] = L[i++];
        }

        while (j < len2) {
            numbers[k++] = R[j++];
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
        MergeSort ms = new MergeSort();
        ms.mergeSort(numbers);
        ms.display(numbers);
    }
}
