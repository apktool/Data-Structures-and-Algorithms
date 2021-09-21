package com.leetcode.demo.easy.greedy;

/**
 * 给定一个非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-swap/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaximumSwap {
    public int solve01(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        int[] last = new int[10];

        for (int i = 0; i < chars.length; i++) {
            last[chars[i] - '0'] = i;
        }

        for (int i = 0; i < chars.length; i++) {
            for (int d = 9; d > chars[i] - '0'; d--) {
                if (last[d] > i) {
                    char tmp = chars[i];
                    chars[i] = chars[last[d]];
                    chars[last[d]] = tmp;

                    return Integer.parseInt(new String(chars));
                }
            }
        }

        return num;
    }
}