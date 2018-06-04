package com.sort.insertion;

/**
 * @author apktool
 * @date 2018-06-04 22:03
 * *
 * ShellSort
 */
public class ShellSort {
    public void shellSort(int[] numbers) {
        int len = numbers.length;

        for (int gap = len; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int temp = numbers[i];

                int j;
                for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap) {
                    numbers[j] = numbers[j - gap];
                }

                numbers[j] = temp;
            }
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
        ShellSort ss = new ShellSort();
        ss.shellSort(numbers);
        ss.display(numbers);
    }
}
