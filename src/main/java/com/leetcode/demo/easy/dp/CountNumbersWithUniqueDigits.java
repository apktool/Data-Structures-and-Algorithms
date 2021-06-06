package com.leetcode.demo.easy.dp;

/**
 * 给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10n 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-numbers-with-unique-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CountNumbersWithUniqueDigits {
    public int solve01(int n) {
        if (n == 0) {
            return 1;
        }
        int n1 = 10, n2 = 9 * 9;

        for (int i = 2; i <= Math.min(n, 10); i++) {
            n1 += n2;
            n2 *= 10 - i;
        }

        return n1;
    }
}
