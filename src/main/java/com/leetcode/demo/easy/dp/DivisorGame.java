package com.leetcode.demo.easy.dp;

/**
 * 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
 * 最初，黑板上有一个数字N。在每个玩家的回合，玩家需要执行以下操作：
 * <p>
 * 选出任一x，满足0 < x < N 且N % x == 0。
 * 用 N - x替换黑板上的数字 N 。
 * 如果玩家无法执行这些操作，就会输掉游戏。
 * <p>
 * 只有在爱丽丝在游戏中取得胜利时才返回True，否则返回 False。假设两个玩家都以最佳状态参与游戏。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divisor-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class DivisorGame {
    public boolean solve01(int n) {
        return n % 2 == 0;
    }

    public boolean solve02(int n) {
        boolean[] dp = new boolean[n + 5];

        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i <= n; ++i) {
            for (int j = 1; j < i; ++j) {
                if ((i % j) == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
