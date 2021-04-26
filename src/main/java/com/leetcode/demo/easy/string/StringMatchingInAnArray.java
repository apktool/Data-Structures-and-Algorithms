package com.leetcode.demo.easy.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个字符串数组 words ，数组中的每个字符串都可以看作是一个单词。请你按 任意 顺序返回 words 中是其他单词的子字符串的所有单词。
 * 如果你可以删除 words[j]最左侧和/或最右侧的若干字符得到 word[i] ，那么字符串 words[i] 就是 words[j] 的一个子字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-matching-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StringMatchingInAnArray {
    public List<String> solve01(String[] str) {
        List<String> list = new ArrayList<>(str.length);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (i == j) {
                    continue;
                }

                if (str[i].contains(str[j]) && !list.contains(str[j])) {
                    list.add(str[j]);
                }
            }
        }

        return list;
    }

    public List<String> solve02(String[] str) {
        List<String> result = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            builder.append(str[i]).append(",");
        }

        String s = builder.toString();

        for (int i = 0; i < str.length; i++) {
            if (s.indexOf(str[i]) != s.lastIndexOf(str[i])) {
                result.add(str[i]);
            }
        }
        return result;
    }
}
