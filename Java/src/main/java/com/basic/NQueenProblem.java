package com.basic;

public class NQueenProblem {
    public boolean isSafe(int[][] queue, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (queue[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (queue[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < queue.length && j >= 0; i++, j--) {
            if (queue[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private void showArray(int[][] queue) {
        for (int i = 0; i < queue.length; i++) {
            for (int j = 0; j < queue.length; j++) {
                System.out.print(queue[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void nQueueProblem(int[][] queue, int col) {
        if (col == queue.length) {
            showArray(queue);
            System.out.println("------------------");
            return;
        }

        for (int i = 0; i < queue.length; i++) {
            if (isSafe(queue, i, col)) {
                queue[i][col] = 1;
                nQueueProblem(queue, col + 1);
                queue[i][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int N = 8;
        int[][] queue = new int[N][N];

        NQueenProblem haha = new NQueenProblem();
        haha.nQueueProblem(queue, 0);
    }
}
