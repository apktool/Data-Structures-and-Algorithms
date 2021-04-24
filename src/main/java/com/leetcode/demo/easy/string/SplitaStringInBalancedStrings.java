package com.leetcode.demo.easy.string;

/**
 * 在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
 * 给你一个平衡字符串s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 注意：分割得到的每个字符串都必须是平衡字符串。
 * 返回可以通过分割得到的平衡字符串的 最大数量 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SplitaStringInBalancedStrings {
    public int solve01(String s) {
        int cnt = 0, t = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('L' == s.charAt(i)) {
                t++;
            } else {
                t--;
            }

            if (t == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}