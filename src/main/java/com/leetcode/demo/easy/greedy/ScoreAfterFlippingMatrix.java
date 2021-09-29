package com.leetcode.demo.easy.greedy;

/**
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1。
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 * 返回尽可能高的分数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/score-after-flipping-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ScoreAfterFlippingMatrix {
    public int solve01(int[][] grid) {
        int res = grid.length << (grid[0].length - 1);

        for (int j = 1; j < grid[0].length; j++) {
            int ret = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][0] == 1) {
                    ret += grid[i][j];
                } else {
                    ret += (1 - grid[i][j]);
                }
            }

            ret = Math.max(ret, grid.length - ret);
            res += ret * (1 << (grid[0].length - 1 - j));
        }

        return res;
    }
}
