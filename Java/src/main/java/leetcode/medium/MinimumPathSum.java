package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-20 19:23
 * *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 * Example:
 *
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinimumPathSum {
    public int minPathSum1(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int[][] array = new int[rows][columns];
        array[0][0] = grid[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j > 0) {
                    array[i][j] = array[0][j - 1] + grid[0][j];
                }

                if (j == 0 && i > 0) {
                    array[i][j] = array[i - 1][0] + grid[i][0];
                }

                if (i != 0 && j != 0) {
                    array[i][j] = Math.min(array[i - 1][j], array[i][j - 1]) + grid[i][j];
                }
            }
        }

        return array[rows - 1][columns - 1];
    }

    public int minPathSum2(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int[] array = new int[columns];
        array[0] = grid[0][0];

        for(int j = 1; j< columns; j++) {
            array[j] = array[j - 1] + grid[0][j];
        }

        for (int i = 1; i < rows; i++) {
            array[0] = array[0] + grid[i][0];
            for (int j = 1; j < columns; j++) {
                array[j] = Math.min(array[j - 1], array[j]) + grid[i][j];
            }
        }

        return array[columns - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result;

        MinimumPathSum haha = new MinimumPathSum();
        result = haha.minPathSum1(grid);
        System.out.println(result);

        result = haha.minPathSum2(grid);
        System.out.println(result);
    }
}
