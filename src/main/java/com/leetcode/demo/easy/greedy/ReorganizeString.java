package com.leetcode.demo.easy.greedy;

/**
 * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorganize-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReorganizeString {
    public String solve01(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[26];

        for (int i = 0; i < chars.length; i++) {
            freq[chars[i] - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        int alphabet = 0;
        for (int i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                alphabet = i;
                if (max > (s.length() + 1) >> 1) {
                    return "";
                }
            }
        }

        int idx = 0;
        char[] res = new char[s.length()];
        while (freq[alphabet]-- > 0) {
            res[idx] = (char) (alphabet + 'a');
            idx += 2;
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i]-- > 0) {
                // 偶数位用完之后，在从 1 开始的奇数位上继续放其他字符
                if (idx >= res.length) {
                    idx = 1;
                }

                res[idx] = (char) (i + 'a');
                idx += 2;
            }
        }

        return new String(res);
    }
}