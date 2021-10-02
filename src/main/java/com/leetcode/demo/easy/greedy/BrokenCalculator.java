package com.leetcode.demo.easy.greedy;

/**
 * 在显示着数字的坏计算器上，我们可以执行以下两种操作：
 * 双倍（Double）：将显示屏上的数字乘 2；
 * 递减（Decrement）：将显示屏上的数字减 1 。
 * 最初，计算器显示数字 X。
 * <p>
 * 返回显示数字 Y 所需的最小操作数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/broken-calculator
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BrokenCalculator {
    public int solve01(int startValue, int target) {
        int res = 0;
        while (target > startValue) {
            res++;

            if (target % 2 == 1) {
                target++;
            } else {
                target /= 2;
            }
        }

        return res + startValue - target;
    }
}
