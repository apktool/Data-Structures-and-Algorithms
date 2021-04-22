package com.leetcode.demo.easy.string;

/**
 * 对于字符串S 和T，只有在 S = T + ... + T（T 自身连接 1 次或多次）时，我们才认定“T 能除尽 S”。
 * <p>
 * 返回最长字符串X，要求满足X 能除尽 str1 且X 能除尽 str2。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/greatest-common-divisor-of-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GreatestCommonDivisorOfStrings {
    public String solve01(String s1, String s2) {
        for (int i = Math.min(s1.length(), s2.length()); i >= 1; i--) {
            if (s1.length() % i == 0 && s2.length() % i == 0) {
                String s = s1.substring(0, i);
                if (check(s1, s) && check(s2, s)) {
                    return s;
                }
            }
        }

        return "";
    }

    private boolean check(String s1, String s2) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= s1.length() / s2.length(); i++) {
            builder.append(s2);
        }

        return builder.toString().equals(s1);
    }
}
