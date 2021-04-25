package com.leetcode.demo.easy.string;

/**
 * 给你一个字符串s，它仅由字母'a' 和 'b'组成。每一次删除操作都可以从 s 中删除一个回文子序列。
 * 返回删除给定字符串中所有字符（字符串为空）的最小删除次数。
 * <p>
 * 「子序列」定义：如果一个字符串可以通过删除原字符串某些字符而不改变原字符顺序得到，那么这个字符串就是原字符串的一个子序列。
 * 「回文」定义：如果一个字符串向后和向前读是一致的，那么这个字符串就是一个回文。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-palindromic-subsequences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemovePalindromicSubsequences {
    /**
     * 注意子字符串和子序列的区别
     * <p>
     * 0 的话非常直白，如果原始字符串本身为空，那么我们需要的次数就是 0。
     * 1 的话意味着我们一次就删掉了所有内容，但我们只能删掉回文子序列，那么也就是说如果原始字符串本身就是一个回文字符串，那么我们需要的次数就是 1。
     * 2 的话剩下的其他字符串就是需要两次即可
     * <p>
     * 作者：poppinl
     * 链接：https://leetcode-cn.com/problems/remove-palindromic-subsequences/solution/bao-bao-ye-neng-kan-dong-de-leetcode-ti-jie-shen-t/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public int solve01(String s) {
        if (s.length() == 0) {
            return 0;
        }
        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }
        }

        return 1;
    }
}
