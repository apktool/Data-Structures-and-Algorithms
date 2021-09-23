package com.leetcode.demo.easy.greedy;

/**
 * 给定一个非负整数N，找出小于或等于N的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字x和y满足x <= y时，我们称这个整数是单调递增的。）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/monotone-increasing-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MonotoneIncreasingDigits {
    public int solve01(int n) {
        char[] chars = String.valueOf(n).toCharArray();

        int flag = chars.length;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i - 1] > chars[i]) {
                flag = i;
                chars[i - 1]--;
            }
        }

        for (int i = flag; i < chars.length; i++) {
            chars[i] = '9';
        }

        return Integer.parseInt(new String(chars));
    }
}
