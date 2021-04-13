package com.leetcode.demo.easy.string;

/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddStrings {
    public String solve01(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i = s1.length() - 1, j = s2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            sum += i >= 0 ? s1.charAt(i) - '0' : 0;
            sum += j >= 0 ? s2.charAt(j) - '0' : 0;
            ans.append(sum % 10);
            carry = sum / 10;
        }
        ans.append(carry == 1 ? carry : "");
        return ans.reverse().toString();
    }
}
