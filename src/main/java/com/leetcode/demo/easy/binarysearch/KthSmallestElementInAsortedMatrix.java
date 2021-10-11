package com.leetcode.demo.easy.binarysearch;

/**
 * 给你一个 n x n 矩阵 matrix ，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是 排序后 的第 k 小元素，而不是第 k 个 不同 的元素。
 * <p>
 * left = -5, right = -4 时，
 * (right + left) / 2            = -4
 * left + (right - left) >> 1    = -2
 * left + ((right - left) >> 1)  = -5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KthSmallestElementInAsortedMatrix {
    public int solve01(int[][] matrix, int k) {
        int left = matrix[0][0];
        int right = matrix[matrix.length - 1][matrix.length - 1];
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            int cnt = search(matrix, mid);
            if (cnt >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int search(int[][] matrix, int mid) {
        int i = matrix.length - 1, j = 0;
        int cnt = 0;
        while (i >= 0 && j < matrix.length) {
            if (matrix[i][j] <= mid) {
                cnt += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return cnt;
    }
}