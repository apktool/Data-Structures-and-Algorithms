package com.leetcode.demo.easy.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
 * 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
 * <p>
 * 山羊拉丁文的规则如下：
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 * 例如，单词"apple"变为"applema"。
 * <p>
 * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词"goat"变为"oatgma"。
 * <p>
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 * <p>
 * 返回将S转换为山羊拉丁文后的句子。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/goat-latin
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GoatLatin {
    public String solve01(String s) {
        s = " " + s + " ";
        char[] arr = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        char head = '0';
        StringBuilder wordBuilder = new StringBuilder();
        for (int i = 1, j = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                if (head != '0') {
                    wordBuilder.append(head);
                }

                wordBuilder.append("ma");

                for (int k = j; k >= 0; k--) {
                    wordBuilder.append("a");
                }

                builder.append(wordBuilder);
                wordBuilder = new StringBuilder();
                head = '0';
                j++;
            }

            if (arr[i - 1] == ' ') {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
                        arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'
                ) {
                    wordBuilder.append(arr[i]);
                } else {
                    head = arr[i];
                }
            } else {
                wordBuilder.append(arr[i]);
            }
        }

        return builder.toString();
    }

    public String solve02(String s) {
        Set<Character> vowel = new HashSet();
        for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'})
            vowel.add(c);

        int cnt = 1;
        StringBuilder ans = new StringBuilder();
        for (String word : s.split(" ")) {
            char first = word.charAt(0);
            if (vowel.contains(first)) {
                ans.append(word);
            } else {
                ans.append(word.substring(1));
                ans.append(word.substring(0, 1));
            }
            ans.append("ma");
            for (int i = 0; i < cnt; i++) {
                ans.append("a");
            }
            cnt++;
            ans.append(" ");
        }

        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
