package com.leetcode.demo.easy.dp;

/**
 * 给定一个只包含三种字符的字符串：(, )和 *，写一个函数来检验这个字符串是否为有效字符串。有效字符串具有如下规则：
 * 任何左括号 ( 必须有相应的右括号 )。
 * 任何右括号 ) 必须有相应的左括号 (。
 * 左括号 ( 必须在对应的右括号之前 )。
 * 可以被视为单个右括号 )，或单个左括号 (，或一个空字符串。
 * 一个空字符串也被视为有效字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parenthesis-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParenthesisString {
    public boolean solve01(String s) {
        /*
         * l: 左括号最少可能有多少个
         * r: 左括号最多可能有多少个
         */
        int l = 0, r = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                l++;
                r++;
            } else if (ch == ')') {
                l--;
                r--;
            } else {
                l--;
                r++;
            }

            l = Math.max(l, 0);

            if (l > r) {
                return false;
            }

        }

        return l == 0;
    }
}
