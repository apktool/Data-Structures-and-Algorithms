package com.leetcode.demo.easy.string;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseWordsInaStringIii {
    public String solve01(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String item : arr) {
            char[] tmp = new char[item.length()];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = item.charAt(tmp.length - i - 1);
            }
            builder.append(tmp).append(" ");
        }

        return builder.toString().trim();
    }
}
