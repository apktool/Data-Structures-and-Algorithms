package com.leetcode.demo.easy.greedy;

/**
 * 给定两个整数 A 和 B，返回任意字符串 S，要求满足：
 * S 的长度为 A + B，且正好包含 A 个 'a' 字母与 B 个 'b' 字母；
 * 子串 'aaa' 没有出现在 S 中；
 * 子串 'bbb' 没有出现在 S 中。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-without-aaa-or-bbb
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class StringWithoutAaaOrBbb {
    public String solve01(int a, int b) {
        StringBuilder builder = new StringBuilder();
        int aCnt = 0, bCnt = 0, len = a + b;

        while (builder.length() < len) {
            if ((a > b && aCnt < 2) || (a <= b && bCnt == 2)) {
                builder.append('a');
                a--;

                aCnt++;
                bCnt = 0;
            } else {
                builder.append('b');
                b--;

                bCnt++;
                aCnt = 0;
            }
        }

        return builder.toString();
    }
}
