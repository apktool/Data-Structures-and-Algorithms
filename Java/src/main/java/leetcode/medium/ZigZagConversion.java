package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-06 18:03
 * *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        StringBuilder[] strBuilder = new StringBuilder[numRows];
        int k = 0;

        for (int i = 0; i < numRows; i++) {
            strBuilder[i] = new StringBuilder();
        }

        while (k < s.length()) {
            for (int i = 0; i < numRows && k < s.length(); i++) {
                strBuilder[i].append(s.charAt(k++));
            }

            for (int i = numRows - 2; i > 0 && k < s.length(); i--){
                strBuilder[i].append(s.charAt(k++));
            }
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            str.append(strBuilder[i].toString());
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result;

        ZigZagConversion haha = new ZigZagConversion();
        result = haha.convert(s, numRows);
        System.out.println(result);
    }
}
