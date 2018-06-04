package com.sort.selection;

/**
 * @author apktool
 * @date 2018-06-03 22:03
 * *
 * HeapSort
 * *
 * http://ind.ntou.edu.tw/~litsnow/al98/pdf/Algorithm-Ch6-Heapsort.pdf
 * https://www.geeksforgeeks.org/heap-sort/
 */
public class HeapSort {
    public void heapSort(int[] numbers) {
        int len = numbers.length;

        if (len == 0) {
            return;
        }

        // Build Heap
        for (int i = len - 1; i >= 0; i--) {
            heapify(numbers, len, i);
        }

        for (int i = len - 1; i >= 0; i--) {
            // Move current root to end
            swap(numbers, 0, i);

            // Adjust Heap
            heapify(numbers, i, 0);
        }
    }

    private void heapify(int[] numbers, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && numbers[left] > numbers[largest]) {
            largest = left;
        }

        if (right < n && numbers[right] > numbers[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(numbers, i, largest);
            heapify(numbers, n, largest);
        }
    }

    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {49, 38, 65, 97, 76, 13, 27, 49};
        HeapSort hs = new HeapSort();
        hs.heapSort(numbers);
        hs.display(numbers);
    }
}
