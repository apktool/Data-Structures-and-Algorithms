package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LetterCombinationsOfAphoneNumber {
    public List<String> solve01(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }

        Map<Character, String> phoneMap = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        backtrack(combinations, new StringBuffer(), phoneMap, digits, 0);

        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuffer buffer, final Map<Character, String> phoneMap, final String digits, int idx) {
        if (idx == digits.length()) {
            combinations.add(buffer.toString());
            return;
        }

        String nums = phoneMap.get(digits.charAt(idx));
        for (int i = 0; i < nums.length(); i++) {
            buffer.append(nums.charAt(i));
            backtrack(combinations, buffer, phoneMap, digits, idx + 1);
            buffer.deleteCharAt(idx);
        }

        return;
    }
}
