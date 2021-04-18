package com.leetcode.demo.easy.string;

/**
 * 我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。要求每位数字都要被旋转。
 * 如果一个数的每位数字被旋转以后仍然还是一个数字，则这个数是有效的。
 * 0, 1, 和 8 被旋转后仍然是它们自己；
 * 2 和 5 可以互相旋转成对方（在这种情况下，它们以不同的方向旋转，换句话说，2 和 5 互为镜像）；
 * 6 和 9 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。
 * 现在我们有一个正整数N, 计算从1 到N 中有多少个数X 是好数？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotated-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotatedDigits {
    public int solve01(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isGoodNumber(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isGoodNumber(int value) {
        String str = String.valueOf(value);
        if (str.contains("3") || str.contains("4") || str.contains("7")) {
            return false;
        }
        if (str.contains("2") || str.contains("5") || str.contains("6") || str.contains("9")) {
            return true;
        }
        return false;
    }

    public int solve02(int n) {
        // 只能包含0125689，且至少包含2569中的一个
        char[] arr = String.valueOf(n).toCharArray();
        int[][][] dp = new int[arr.length + 1][2][2];
        // dp[i][j][k]，j表示前i位是否是n的前缀，0:不是，1:是，k表示前i位是否有2569，0:没有，1：有
        dp[arr.length][0][0] = 1;
        dp[arr.length][1][0] = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= 1; j++) {
                for (char d = '0'; d <= (j == 1 ? arr[i] : '9'); ++d) {
                    if (d == '3' || d == '4' || d == '7') {
                        continue;
                    }

                    int tmp = d == arr[i] ? j : 0;
                    if (d == '2' || d == '5' || d == '6' || d == '9') {
                        dp[i][j][1] += dp[i + 1][tmp][0] + dp[i + 1][tmp][1];
                    } else {// 018
                        dp[i][j][0] += dp[i + 1][tmp][0];
                        dp[i][j][1] += dp[i + 1][tmp][1];
                    }
                }
            }
        }
        return dp[0][1][1];
    }
}
