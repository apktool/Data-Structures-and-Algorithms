package leetcode.easy;

/**
 * @author apktool
 * @date 2018-07-04 22:23
 * *
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 *
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * - All letters in this word are capitals, like "USA".
 * - All letters in this word are not capitals, like "leetcode".
 * - Only the first letter in this word is capital if it has more than one letter, like "Google".
 *
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 */
public class DetectCapital {
    public boolean detectCapitalUse1(String word) {
        int cnt = 0;
        for (char ch : word.toCharArray()) {
            if ('Z' - ch >= 0) {
                cnt++;
            }
        }
        return cnt == 0 || cnt == word.length() || (cnt == 1 && 'Z' - word.charAt(0) >= 0);
    }

    public boolean detectCapitalUse2(String word) {
        return word.matches("[A-Z][a-z]*|[A-Z]*|[a-z]*");
    }

    public static void main(String[] args) {
        String word = "Apktool";
        boolean result;

        DetectCapital haha = new DetectCapital();

        result = haha.detectCapitalUse1(word);
        System.out.println(result);

        result = haha.detectCapitalUse2(word);
        System.out.println(result);
    }
}
