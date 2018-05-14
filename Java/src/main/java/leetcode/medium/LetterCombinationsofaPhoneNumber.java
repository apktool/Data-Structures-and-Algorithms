package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-05-14 20:35
 * *
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) {
            return ans;
        }
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");

        while (ans.peek().length() != digits.length()) {
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for (char c : map.toCharArray()) {
                ans.addLast(remove + c);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> result;

        LetterCombinationsofaPhoneNumber hah = new LetterCombinationsofaPhoneNumber();
        result = hah.letterCombinations(digits);
        System.out.println(result);
    }
}
