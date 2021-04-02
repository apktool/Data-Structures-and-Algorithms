package com.leetcode.demo.easy.array;

/**
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，
 * 平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/image-smoother
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ImageSmoother {
    public int[][] solve01(int[][] nums) {
        int[][] ans = new int[nums.length][nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int[] res = calc(nums, i, j);
                ans[i][j] = res[0] / res[1];
            }
        }

        return ans;
    }

    private int[] calc(int[][] nums, int m, int n) {
        int[] res = new int[2];
        for (int i = m - 1; i <= m + 1; i++) {
            for (int j = n - 1; j <= n + 1; j++) {
                if (i >= 0 && i < nums.length && j >= 0 && j < nums[i].length) {
                    res[0] += nums[i][j];
                    res[1]++;
                }
            }
        }
        return res;
    }
}
