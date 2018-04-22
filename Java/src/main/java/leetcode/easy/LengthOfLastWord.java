package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-22 09:35
 * *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        if (s.trim().isEmpty()) {
            return 0;
        }

        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public int lengthOfLastWord2(String s) {
        int len = s.length(), lastLength = 0;

        while (len > 0 && s.charAt(len - 1) == ' ') {
            len--;
        }

        while (len > 0 && s.charAt(len - 1) != ' ') {
            lastLength++;
            len--;
        }
        return lastLength;
    }

    public static void main(String[] args) {
        String s = " ";
        int result;

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        result = lengthOfLastWord.lengthOfLastWord1(s);
        System.out.println(result);

        result = lengthOfLastWord.lengthOfLastWord2(s);
        System.out.println(result);
    }
}
