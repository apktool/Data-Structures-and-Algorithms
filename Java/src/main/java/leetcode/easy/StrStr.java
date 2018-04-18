package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-18 21:08
 * *
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */
public class StrStr {
    public int strStr1(String haystack, String needle) {
        int length = needle.length();
        int index = 0;

        if(haystack.equals(needle)) {
            return 0;
        }

        while (index != haystack.length()) {
            if ((index + length) > haystack.length()) {
                return -1;
            }

            if (haystack.substring(index, index + length).equals(needle)) {
                return index;
            }

            index++;
        }

        return -1;
    }

    public int strStr2(String haystack,  String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        int result;
        StrStr strStr = new StrStr();

        result = strStr.strStr1(haystack, needle);
        System.out.println(result);

        result = strStr.strStr2(haystack, needle);
        System.out.println(result);
    }
}
