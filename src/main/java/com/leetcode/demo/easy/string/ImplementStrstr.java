package com.leetcode.demo.easy.string;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ImplementStrstr {
    public int solve01(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public int solve02(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i < len1 - len2 + 1; i++) {
            if (s2.equals(s1.substring(i, i + s2.length()))) {
                return i;
            }
        }
        return -1;
    }

    /**
     * KMP
     *
     * @param s1
     * @param s2
     * @return
     * @link https://leetcode-cn.com/problems/implement-strstr/solution/guan-yu-wo-di-yi-ci-kan-kmp-suan-fa-jiu-sqs0d/
     */
    public int solve03(String s1, String s2) {
        if (s2.isEmpty()) {
            return 0;
        }

        if (s1.isEmpty() || s1.length() < s2.length()) {
            return -1;
        }

        // int[] next = next1(s2);
        int[] next = next(s2);

        for (int i = 0, j = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (j - 1 != -1) {
                    j = next[j - 1] + 1;
                    i--;
                }
            } else {
                j++;
                if (j == s2.length()) {
                    return i - j + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 容易理解版本的next求法
     *
     * @param s
     * @return
     */
    private int[] next1(String s) {
        char[] str = s.toCharArray();
        int[] next = new int[str.length];
        next[0] = -1;

        int i = 1, k = -1;
        while (i < str.length) {
            if (k != -1) {
                if (str[i] == str[k + 1]) {
                    next[i] = k + 1;
                    i++;
                    k++;
                } else {
                    k = next[k];
                }
            } else {
                k = next[i] = str[0] == str[i] ? 0 : -1;
                i++;
            }
        }

        return next;
    }

    /**
     * 精简版本的next求法
     *
     * @param s
     * @return
     */
    private int[] next(String s) {
        char[] str = s.toCharArray();
        int[] next = new int[str.length];
        next[0] = -1;
        int i = 1, k = -1;

        while (i < str.length) {
            if (k == -1) {
                k = next[i] = str[0] == str[i++] ? 0 : -1;
            } else {
                k = str[i] == str[k + 1] ? next[i++] = k + 1 : next[k];
            }
        }
        return next;
    }

    /**
     * Sunday
     *
     * @param s1
     * @param s2
     * @return
     * @link https://leetcode-cn.com/problems/implement-strstr/solution/python3-sundayjie-fa-9996-by-tes/
     */
    public int solve04(String s1, String s2) {
        return -1;
    }
}
