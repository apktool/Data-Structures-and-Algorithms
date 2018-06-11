package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-06-10 21:02
 * *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }

        if (open > close) {
            backtrack(list, str + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        GenerateParentheses haha = new GenerateParentheses();
        List<String> list = haha.generateParenthesis(n);
        System.out.println(list);
    }
}
