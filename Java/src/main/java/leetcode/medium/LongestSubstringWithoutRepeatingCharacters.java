package leetcode.medium;

import java.util.HashMap;

/**
 * @author apktool
 * @date 2018-05-04 20:12
 * *
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int max = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                j = Math.max(j, hashMap.get(s.charAt(i)) + 1);
            }
            System.out.printf("%d - %d\n", i, j);

            hashMap.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result;

        LongestSubstringWithoutRepeatingCharacters haha = new LongestSubstringWithoutRepeatingCharacters();
        result = haha.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
