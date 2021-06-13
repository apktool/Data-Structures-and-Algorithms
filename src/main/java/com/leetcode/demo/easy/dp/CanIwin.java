package com.leetcode.demo.easy.dp;

/**
 * 在 "100 game" 这个游戏中，两名玩家轮流选择从 1 到 10 的任意整数，累计整数和，先使得累计整数和达到或超过 100 的玩家，即为胜者。
 * 如果我们将游戏规则改为 “玩家不能重复使用整数” 呢？
 * 例如，两个玩家可以轮流从公共整数池中抽取从 1 到 15 的整数（不放回），直到累计整数和 >= 100。
 * <p>
 * 给定一个整数max（整数池中可选择的最大数）和另一个整数total（累计和），判断先出手的玩家是否能稳赢（假设两位玩家游戏时都表现最佳）？
 * 你可以假设max不会大于 20，total不会大于 300。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/can-i-win
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CanIwin {
    public boolean canIWin(int max, int total) {
        if (max >= total) {
            return true;
        }
        if ((1 + max) * max / 2 < total) {
            return false;
        }

        return dfs(0, total, new Boolean[1 << max], max);
    }

    private boolean dfs(int state, int total, Boolean[] dp, int max) {
        if (dp[state] != null) {
            return dp[state];
        }

        for (int i = 1; i <= max; i++) {
            int cur = 1 << (i - 1);
            if ((cur & state) != 0) {
                continue;
            }

            if (i >= total || !dfs(cur | state, total - i, dp, max)) {
                return dp[state] = true;
            }
        }
        return dp[state] = false;
    }
}
