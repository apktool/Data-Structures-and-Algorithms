package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-27 19:15
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 *
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * Example:
 *
 * Input: [1,2,3,0,2]
 * Output: 3
 * Explanation: transactions = [buy, sell, cooldown, buy, sell]
 *
 * Reference:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/discuss/75928/Share-my-DP-solution-(By-State-Machine-Thinking)
 */
public class BestTimetoBuyandSellStockwithCooldown {
    int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int[] s0 = new int[prices.length];
        int[] s1 = new int[prices.length];
        int[] s2 = new int[prices.length];

        s1[0] = -prices[0];
        s0[0] = 0;
        s2[0] = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            s0[i] = Math.max(s0[i - 1], s2[i - 1]);
            s1[i] = Math.max(s1[i - 1], s0[i - 1] - prices[i]);
            s2[i] = s1[i - 1] + prices[i];
        }
        return Math.max(s0[prices.length - 1], s2[prices.length - 1]);
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        int result;

        BestTimetoBuyandSellStockwithCooldown haha = new BestTimetoBuyandSellStockwithCooldown();
        result = haha.maxProfit(prices);
        System.out.println(result);
    }
}
