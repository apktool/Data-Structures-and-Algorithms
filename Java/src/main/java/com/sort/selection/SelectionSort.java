package com.sort.selection;

/**
 * @author apktool
 * @date 2018-06-03 21:53
 * *
 * SelectionSort
 */
public class SelectionSort {
    public void simpleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    int temp = numbers[j];
                    numbers[j] = min;
                    min = temp;
                }
            }
            numbers[i] = min;
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
        SelectionSort ss = new SelectionSort();
        ss.simpleSort(numbers);
        ss.display(numbers);
    }
}
