package com.leetcode.demo.easy.string;

/**
 * 给你一个字符串s，它由数字（'0' - '9'）和'#'组成。我们希望按下述规则将s映射为一些小写英文字符：
 * <p>
 * 字符（'a' - 'i'）分别用（'1' -'9'）表示。
 * 字符（'j' - 'z'）分别用（'10#'-'26#'）表示。
 * 返回映射之后形成的新字符串。
 * <p>
 * 题目数据保证映射始终唯一。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public String solve01(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                builder.append((char) ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '1') + 'a'));
                i += 2;
            } else {
                builder.append((char) (s.charAt(i) - '1' + 'a'));
            }
        }

        return builder.toString();
    }
}
