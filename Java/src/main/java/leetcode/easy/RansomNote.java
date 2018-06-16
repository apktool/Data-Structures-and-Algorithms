package leetcode.easy;

/**
 * @author apktool
 * @date 2018-06-16 21:22
 * *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * <p>
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 此题的意思应该是从第二字符串中任取出一个字符串构造第一个字符串，假设第二字符串中的字符只可以取一次、
 * 也就是说，第一个字符串不一定在第二个字符串中相对有序
 */
public class RansomNote {
    // 此处题意理解错误
    public boolean canConstruct1(String ransomNote, String magazine) {
        char[] a = magazine.toCharArray();
        char[] b = ransomNote.toCharArray();
        int j = 0;

        for (int i = 0; i < a.length && j < b.length; i++) {
            if (a[i] == b[j]) {
                ++j;
            }
        }

        return j == b.length ? true : false;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "fffbfg";
        String magazine = "effjfggbffjdgbjjhhdegh";
        boolean flag;

        RansomNote haha = new RansomNote();

        flag = haha.canConstruct1(ransomNote, magazine);
        System.out.println(flag);

        flag = haha.canConstruct2(ransomNote, magazine);
        System.out.println(flag);
    }
}
