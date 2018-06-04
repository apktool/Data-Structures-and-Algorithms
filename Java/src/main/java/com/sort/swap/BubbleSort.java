package com.sort.swap;

/**
 * @author apktool
 * @date 2018-06-03 21:28
 * *
 * BubbleSort
 */
public class BubbleSort {
    public void bubbleSort(int[] numbers) {
        for(int i = 0; i<numbers.length; i++) {
            for(int j = i; j< numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public void display(int[] numbers) {
        for(int i = 0; i< numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {49, 38, 65, 97, 76, 13, 27, 49};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(numbers);
        bs.display(numbers);
    }
}
