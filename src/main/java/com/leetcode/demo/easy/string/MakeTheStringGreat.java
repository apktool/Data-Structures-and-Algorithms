package com.leetcode.demo.easy.string;

/**
 * 给你一个由大小写英文字母组成的字符串 s 。
 * 一个整理好的字符串中，两个相邻字符 s[i] 和 s[i+1]，其中 0<= i <= s.length-2 ，要满足如下条件:
 * <p>
 * 若 s[i] 是小写字符，则 s[i+1] 不可以是相同的大写字符。
 * 若 s[i] 是大写字符，则 s[i+1] 不可以是相同的小写字符。
 * 请你将字符串整理好，每次你都可以从字符串中选出满足上述条件的 两个相邻 字符并删除，直到字符串整理好为止。
 * <p>
 * 请返回整理好的 字符串 。题目保证在给出的约束条件下，测试样例对应的答案是唯一的。
 * 注意：空字符串也属于整理好的字符串，尽管其中没有任何字符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/make-the-string-great
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MakeTheStringGreat {
    public String solve01(String s) {
        for (; ; ) {
            String tmp = isWhile(s);
            if (s.equals(tmp)) {
                break;
            } else {
                s = tmp;
            }
        }

        return s;
    }

    private String isWhile(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 != s.length() && (s.charAt(i) + 32 == s.charAt(i + 1) || s.charAt(i) - 32 == s.charAt(i + 1))) {
                i++;
                continue;
            } else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

    public String solve02(String s) {
        StringBuilder builder = new StringBuilder();
        int retIndex = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (builder.length() > 0 && (builder.charAt(retIndex) ^ ch) == 32) {
                builder.deleteCharAt(retIndex);
                retIndex--;
            } else {
                builder.append(ch);
                retIndex++;
            }
        }
        return builder.toString();
    }
}