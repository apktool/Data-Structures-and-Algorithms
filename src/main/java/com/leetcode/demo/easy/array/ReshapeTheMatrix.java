package com.leetcode.demo.easy.array;

/**
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * <p>
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * <p>
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * <p>
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reshape-the-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReshapeTheMatrix {
    public int[][] solve01(int[][] nums, int r, int c) {

        int[][] res = new int[r][c];
        int p = 0;
        int q = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums.length * nums[i].length != r * c) {
                    return nums;
                }

                res[p][q++] = nums[i][j];

                if (q == c) {
                    q = 0;
                    p++;
                }
            }
        }

        return res;
    }

    public int[][] solve02(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        int p = 0, q = 0;
        if (r * c > m * n) {
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (q == n) {
                    p += 1;
                    q = 0;
                }
                if (q < n) {
                    res[i][j] = nums[p][q++];
                }
            }
        }
        return res;
    }
}
