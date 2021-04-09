package com.leetcode.demo.easy.string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {
    /**
     * 横向扫描
     *
     * @param s
     * @return
     */
    public String solve01(String[] s) {
        if (s == null || s.length == 0) {
            return "";
        }

        String pre = s[0];
        for (int i = 1; i < s.length; i++) {
            pre = prefix(pre, s[i]);
        }
        return pre;
    }

    private String prefix(String a, String b) {
        int i = 0;
        int len = Math.min(a.length(), b.length());

        while (i < len) {
            if (a.charAt(i) != b.charAt(i)) {
                break;
            }
            i++;
        }

        return a.substring(0, i);
    }

    /**
     * 纵向扫描
     *
     * @param s
     * @return
     */
    public String solve02(String[] s) {
        if (s == null || s.length == 0) {
            return "";
        }
        int length = s[0].length();
        int count = s.length;
        for (int i = 0; i < length; i++) {
            char c = s[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == s[j].length() || s[j].charAt(i) != c) {
                    return s[0].substring(0, i);
                }
            }
        }
        return s[0];
    }
}
