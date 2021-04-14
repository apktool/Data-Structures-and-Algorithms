package com.leetcode.demo.easy.string;

/**
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * <p>
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * <p>
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写，比如"Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/detect-capital
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DetectCapital {
    public boolean solve01(String s) {
        int[] ans = new int[s.length()];
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                ans[i] = 1;
            }
            sum += ans[i];
        }

        if (ans[0] == 1) {
            if (sum - ans[0] == ans.length - 1 || sum - ans[0] == 0) {
                return true;
            }
        } else {
            if (sum == 0) {
                return true;
            }
        }

        return false;
    }

    public boolean solve02(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                cnt++;
            }
        }

        return cnt == 0 || cnt == s.length() || cnt == 1 && Character.isUpperCase(s.charAt(0));
    }
}
