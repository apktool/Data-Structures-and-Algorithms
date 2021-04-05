package com.leetcode.demo.easy.array;

/**
 * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
 * <p>
 * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/transpose-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TransposeMatrix {
    public int[][] solve01(int[][] nums) {
        int[][] copy = new int[nums[0].length][nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                copy[j][i] = nums[i][j];
            }
        }

        return copy;
    }

    public int[][] solve02(int[][] nums) {
        int[][] copy = new int[nums[0].length][nums.length];

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                copy[i][j] = nums[j][i];
            }
        }

        return copy;
    }

}
