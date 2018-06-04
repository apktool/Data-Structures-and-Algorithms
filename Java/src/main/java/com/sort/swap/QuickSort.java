package com.sort.swap;

/**
 * @author apktool
 * @date 2018-06-03 21:34
 * *
 * QuickSort
 */
public class QuickSort {
    public void quickSort(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }

        quickSortHelper(numbers, 0, numbers.length - 1);
    }

    private void quickSortHelper(int[] numbers, int low, int high) {
        if (low > high) {
            return;
        }

        int temp = partition(numbers, low, high);
        quickSortHelper(numbers, low, temp - 1);
        quickSortHelper(numbers, temp + 1, high);
    }

    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[low];
        while (low < high) {
            while (low < high && numbers[high] >= pivot) {
                high--;
            }
            numbers[low] = numbers[high];

            while (low < high && numbers[low] <= pivot) {
                low++;
            }
            numbers[high] = numbers[low];
        }
        numbers[low] = pivot;
        return low;
    }

    public void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {49, 38, 65, 97, 76, 13, 27, 49};
        QuickSort qs = new QuickSort();
        qs.quickSort(numbers);
        qs.display(numbers);
    }
}
