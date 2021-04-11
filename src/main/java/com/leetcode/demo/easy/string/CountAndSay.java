package com.leetcode.demo.easy.string;

/**
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 * <p>
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * <p>
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 * <p>
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * <p>
 * 前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * 描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
 * 描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
 * 描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
 * 描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
 *
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CountAndSay {
    public String solve01(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = say(s);
        }

        return s;
    }

    public String say(String s) {
        StringBuilder builder = new StringBuilder();

        if (s.length() == 1) {
            builder.append('1').append(s);
        }

        for (int i = 1, cnt = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt += 1;
                if (i == s.length() - 1) {
                    builder.append(cnt).append(s.charAt(i - 1));
                }
            } else {
                builder.append(cnt).append(s.charAt(i - 1));
                cnt = 1;
                if (i == s.length() - 1) {
                    builder.append(1).append(s.charAt(i));
                }
            }
        }

        return builder.toString();
    }
}