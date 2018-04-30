package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-30 18:59
 * *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        char[] chs = s.toLowerCase().toCharArray();

        int j = 0;
        for (int i = 0; i < chs.length; i++) {
            /*
            int len1 = 'z' - chs[i];
            int len2 = '9' - chs[i];

            if ((len1 >= 0 && len1 < 26) || (len2 >= 0 && len2 <= 9)) {
                chs[j++] = chs[i];
            }
            */

            if(Character.isLetter(chs[i]) || Character.isDigit(chs[i])) {
                chs[j++] = chs[i];
            }
        }

        for (int i = 0; i < j / 2; i++) {
            if (chs[i] != chs[j - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "0p";
        boolean flag;

        ValidPalindrome v = new ValidPalindrome();
        flag = v.isPalindrome(s);
        System.out.println(flag);
    }
}
