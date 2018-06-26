package leetcode.medium;

/**
 * @author apktool
 * @date 2018-06-26 21:34
 * *
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * Output:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 *
 * Follow up:
 *
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 */

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        boolean fr = false, fc = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        fr = true;
                    }
                    if (j == 0) {
                        fc = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (fc) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}};

        SetMatrixZeroes sm = new SetMatrixZeroes();
        sm.setZeroes(matrix);
        sm.display(matrix);
    }
}
