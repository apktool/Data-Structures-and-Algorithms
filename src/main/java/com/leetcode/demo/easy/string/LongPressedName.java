package com.leetcode.demo.easy.string;

/**
 * 你的朋友正在使用键盘输入他的名字name。偶尔，在键入字符c时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * 你将会检查键盘输入的字符typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回True。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/long-pressed-name
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongPressedName {
    public boolean solve01(String s1, String s2) {
        int i = 0, j = 0;
        while (j < s2.length()) {
            if (i < s1.length() && s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && s2.charAt(j) == s2.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == s1.length();
    }
}
