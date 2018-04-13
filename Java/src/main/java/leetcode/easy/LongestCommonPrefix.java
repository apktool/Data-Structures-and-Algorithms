package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-13 20:59
 * *
 * It seems that it is not to check between pair of strings but on all the strings in the array.
 * For example:
 * {“a”,“a”,“b”} should give “” as there is nothing common in all the 3 strings.
 * {“a”, “a”} should give “a” as a is longest common prefix in all the strings.
 * {“abca”, “abc”} as abc
 * {“ac”, “ac”, “a”, “a”} as a.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }

        int min = strs[0].length();
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                index = i;
            }
        }

        String commonPrefix = strs[index];
        for (int i = 0; i <= strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(commonPrefix)) {
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                    continue;
                }
            }
        }

        return commonPrefix;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] strs = {"abc", "ab", "abde"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result;

        result = longestCommonPrefix.longestCommonPrefix1(strs);
        System.out.println(result);

        result = longestCommonPrefix.longestCommonPrefix2(strs);
        System.out.println(result);
    }
}
