package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author li.wengang
 * @date 2018-11-28 00:01
 * *
 * Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent,
 * the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.
 *
 * Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.
 * Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
 *
 * Note:
 *
 * The order of returned grid coordinates does not matter.
 * Both m and n are less than 150.
 *
 * Example:
 * Given the following 5x5 matrix:
 *
 *   Pacific ~   ~   ~   ~   ~
 *        ~  1   2   2   3  (5) *
 *        ~  3   2   3  (4) (4) *
 *        ~  2   4  (5)  3   1  *
 *        ~ (6) (7)  1   4   5  *
 *        ~ (5)  1   1   2   4  *
 *           *   *   *   *   * Atlantic
 *
 * Return:
 * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
 */
public class PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> res = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) {
            return res;
        }

        int n = matrix[0].length;

        boolean[][] pa = new boolean[m][n];
        boolean[][] at = new boolean[m][n];


        for (int i = 0; i < m; i++) {
            flow(pa, matrix, i, 0, m, n, Integer.MIN_VALUE);
            flow(at, matrix, i, n - 1, m, n, Integer.MIN_VALUE);
        }

        for (int j = 0; j < n; j++) {
            flow(pa, matrix, 0, j, m, n, Integer.MIN_VALUE);
            flow(at, matrix, m - 1, j, m, n, Integer.MIN_VALUE);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pa[i][j] && at[i][j]) {
                    res.add(new int[]{i, j});
                }
            }
        }

        return res;
    }

    private void flow(boolean[][] visited, int[][] matrix, int i, int j, int m, int n, int lastVal) {
        if (i < 0 || i == m || j < 0 || j == n || visited[i][j] || lastVal > matrix[i][j]) {
            return;
        }

        visited[i][j] = true;

        flow(visited, matrix, i + 1, j, m, n, matrix[i][j]);
        flow(visited, matrix, i - 1, j, m, n, matrix[i][j]);
        flow(visited, matrix, i, j - 1, m, n, matrix[i][j]);
        flow(visited, matrix, i, j + 1, m, n, matrix[i][j]);
    }

    public static void main(String[] args) {
        /**
         * 注意(2,1)这个点，也就是6这个unit cell
         * 可以通过 [6 -> 5 -> 4 -> 3] 这条路径流入Pacific
         * 可以通过 [6 -> 5] 流入atlantic
         * 所以该点仍然是合法的点
         */

        int[][] matrix = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        PacificAtlanticWaterFlow pf = new PacificAtlanticWaterFlow();
        List<int[]> res = pf.pacificAtlantic(matrix);
        res.forEach(s -> {
            int a = s[0];
            int b = s[1];
            System.out.println(a + " " + b + " | " + matrix[a][b]);
        });
    }
}
