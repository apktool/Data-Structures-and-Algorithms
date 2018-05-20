package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-15 21:05
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 *
 * Note: m and n will be at most 100.
 * Example 1:
 * Input:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * Output: 2
 *
 * Explanation:
 * There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;

        int[][] array = new int[rows][columns];
        array[0][0] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (obstacleGrid[i][j] == 1) {
                    array[i][j] = 0;
                } else {
                    if (i == 0 && j > 0) {
                        array[i][j] = array[i][j - 1] + array[i][j];
                    }
                    if (j == 0 && i > 0) {
                        array[i][j] = array[i - 1][j] + array[i][j];
                    }
                    if (i != 0 && j != 0) {
                        array[i][j] = array[i - 1][j] + array[i][j - 1];
                    }
                }
            }
        }

        return array[rows - 1][columns - 1];
    }

    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1) {
                    dp[j] = 0;
                } else if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return dp[width - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0}, {1, 1}, {0, 0}};
        int result;

        UniquePathsII uniquePathsII = new UniquePathsII();
        result = uniquePathsII.uniquePathsWithObstacles1(obstacleGrid);
        System.out.println(result);


        result = uniquePathsII.uniquePathsWithObstacles2(obstacleGrid);
        System.out.println(result);
    }
}
