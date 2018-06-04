package com.sort.insertion;

/**
 * @author apktool
 * @date 2018-06-04 21:54
 * *
 * InsertionSort
 * *
 */
public class InsertionSort {
    public void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
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
        InsertionSort is = new InsertionSort();
        is.insertionSort(numbers);
        is.display(numbers);
    }
}
