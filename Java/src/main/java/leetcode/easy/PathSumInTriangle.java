package leetcode.easy;

import java.util.Arrays;

/**
 * @author apktool
 * @date 2018-05-16 20:47
 * *
 * 图给出了一个数字三角形，请编写一个程序，计算从顶至底的某处的一条路径，使该路径所经过的数字的总和最大。
 * 每一步可沿左斜线向下或右斜线向下
 * 1 < 三角形行数 < 100
 * 三角形数字为0，1，… 99
 * 输入  5
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * 输出
 * 30
 */
public class PathSumInTriangle {
    private int level = 5;
    private int[][] maxArray = new int[5][];

    public PathSumInTriangle() {
        this.clear();
    }

    private void clear() {
        int[] temp = new int[5];
        Arrays.fill(temp, -1);
        Arrays.fill(maxArray, temp);
    }

    public void display(int[][] array) {
        for(int i = 0; i< array.length; i++) {
            for(int j = 0; j< array[level - 1].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public int MaxPathSum1(int[][] array, int i, int j) {
        if (i == level - 1) {
            return array[i][j];
        }
        return Math.max(MaxPathSum1(array, i + 1, j), MaxPathSum1(array, i + 1, j + 1)) + array[i][j];
    }

    public int MaxPathSum2(int[][] array, int i, int j) {
        if (array[i][j] == -1) {
            return maxArray[i][j];
        }

        if (i == level - 1) {
            return array[i][j];
        }

        maxArray[i][j] = Math.max(MaxPathSum1(array, i + 1, j), MaxPathSum1(array, i + 1, j + 1)) + array[i][j];

        return maxArray[i][j];
    }

    public int MaxPathSum3(int[][] array, int i, int j) {
        this.clear();

        for(int column = 0; column < level; column++) {
            maxArray[level - 1][column] = array[level - 1][column];
        }

        for (int row = level - 2; row >= 0; row--) {
            for (int column = 0; column <= row; column++) {
                maxArray[row][column] = Math.max(maxArray[row + 1][column], maxArray[row + 1][column + 1]) + array[row][column];
            }
        }

        return maxArray[0][0];
    }

    public int MaxPathSum4(int[][] array, int i, int j) {
        int[] temp = array[level - 1];

        for (int row = level - 2; row >= 0; row--) {
            for (int column = 0; column <= row; column++) {
                temp[column] = Math.max(temp[column], temp[column + 1]) + array[row][column];
            }
        }

        return temp[0];
    }


    public static void main(String[] args) {
        int[][] array = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        long start = 0;
        long end = 0;

        PathSumInTriangle haha = new PathSumInTriangle();
        System.out.printf("time\tsum\n");

        start = System.nanoTime();
        System.out.print("|\t\t|\n");
        end = System.nanoTime();
        System.out.printf("%d\t %d\n", end - start, -1);


        start = System.nanoTime();
        int result1 = haha.MaxPathSum1(array, 0, 0);
        end = System.nanoTime();
        System.out.printf("%d\t %d\n", end - start, result1);

        start = System.nanoTime();
        int result2 = haha.MaxPathSum2(array, 0, 0);
        end = System.nanoTime();
        System.out.printf("%d\t %d\n", end - start, result2);

        start = System.nanoTime();
        int result3 = haha.MaxPathSum3(array, 0, 0);
        end = System.nanoTime();
        System.out.printf("%d\t %d\n", end - start, result3);

        start = System.nanoTime();
        int result4 = haha.MaxPathSum4(array, 0, 0);
        end = System.nanoTime();
        System.out.printf("%d\t %d\n", end - start, result4);
    }
}
