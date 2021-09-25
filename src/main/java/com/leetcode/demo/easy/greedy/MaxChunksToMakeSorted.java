package com.leetcode.demo.easy.greedy;

/**
 * 数组arr是[0, 1, ..., arr.length - 1]的一种排列，我们将这个数组分割成几个“块”，
 * 并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
 * 我们最多能将数组分成多少块？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/max-chunks-to-make-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxChunksToMakeSorted {
    public int solve01(int[] arr) {
        int res = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                res++;
            }
        }

        return res;
    }
}
