package com.leetcode.demo.easy.dp;

/**
 * 我们正在玩一个猜数游戏，游戏规则如下：
 * 我从1到 n 之间选择一个数字，你来猜我选了哪个数字。
 * 每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了。
 * 然而，当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。直到你猜到我选的数字，你才算赢得了这个游戏。
 * 示例:
 * <p>
 * n = 10, 我选择了8.
 * 第一轮: 你猜我选择的数字是5，我会告诉你，我的数字更大一些，然后你需要支付5块。
 * 第二轮: 你猜是7，我告诉你，我的数字更大一些，你支付7块。
 * 第三轮: 你猜是9，我告诉你，我的数字更小一些，你支付9块。
 * 游戏结束。8 就是我选的数字。
 * 你最终要支付 5 + 7 + 9 = 21 块钱。
 * <p>
 * 给定n ≥ 1，计算你至少需要拥有多少现金才能确保你能赢得这个游戏。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/guess-number-higher-or-lower-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GuessNumberHigherOrLowerIi {

    public int solve01(int n) {
        return calculate(1, n);
    }

    private int calculate(int low, int high) {
        if (low >= high) {
            return 0;
        }
        int minres = Integer.MAX_VALUE;
        for (int i = low; i <= high; i++) {
            int res = i + Math.max(calculate(i + 1, high), calculate(low, i - 1));
            minres = Math.min(res, minres);
        }

        return minres;
    }

    /**
     * dp[i,j] 代表在 [i, j] 中最坏情况下最小开销的代价
     *
     * @param n
     * @return
     */
    public int solve02(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int minres = Integer.MAX_VALUE;
                for (int piv = start; piv < start + len - 1; piv++) {
                    int res = piv + Math.max(dp[start][piv - 1], dp[piv + 1][start + len - 1]);
                    minres = Math.min(res, minres);
                }
                dp[start][start + len - 1] = minres;
            }
        }
        return dp[1][n];
    }
}
