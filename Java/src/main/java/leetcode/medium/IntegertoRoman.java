package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-13 11:39
 */
public class IntegertoRoman {
    public int romanToInt(String s) {
        int[] tagVal = new int[258];

        tagVal['I'] = 1;
        tagVal['V'] = 5;
        tagVal['X'] = 10;
        tagVal['C'] = 100;
        tagVal['M'] = 1000;
        tagVal['L'] = 50;
        tagVal['D'] = 500;

        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 >= s.length() || tagVal[s.charAt(i + 1)] <= tagVal[s.charAt(i)]) {
                val += tagVal[s.charAt(i)];
            } else {
                val -= tagVal[s.charAt(i)];
            }
        }
        return val;
    }

    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }

        String ret = "";
        final int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] flags = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < number.length && num > 0; i++) {
            if (num < number[i]) {
                continue;
            }

            while (num >= number[i]) {
                num -= number[i];
                ret += flags[i];
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        IntegertoRoman haha = new IntegertoRoman();

        String s = "MCMXCVI";
        int resultToInt = haha.romanToInt(s);
        System.out.println(resultToInt);

        int num = 1996;
        String resultToRoman = haha.intToRoman(num);
        System.out.println(resultToRoman);
    }
}
