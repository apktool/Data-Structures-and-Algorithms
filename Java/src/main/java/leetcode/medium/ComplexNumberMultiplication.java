package leetcode.medium;

/**
 * @author apktool
 * @date 2018-07-06 20:06
 * *
 * Given two strings representing two complex numbers.
 * <p>
 * You need to return a string representing their multiplication. Note i2 = -1 according to the definition.
 *
 * Example 1:
 * Input: "1+1i", "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 *
 * Example 2:
 * Input: "1+-1i", "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 *
 * Note:
 *
 * The input strings will not have extra blank.
 * The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 */

public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        int[] paramA = getParam(a);
        int[] paramB = getParam(b);
        int[] ans = new int[2];
        ans[0] = paramA[0] * paramB[0] - paramA[1] * paramB[1];
        ans[1] = paramA[0] * paramB[1] + paramA[1] * paramB[0];
        return ans[0] + "+" + ans[1] + "i";
    }

    private int[] getParam(String complexNumber) {
        int[] param = new int[2];
        int plusPos = complexNumber.indexOf("+");
        param[0] = Integer.valueOf(complexNumber.substring(0, plusPos));
        param[1] = Integer.valueOf(complexNumber.substring(plusPos + 1, complexNumber.length() - 1));
        return param;
    }

    public static void main(String[] args) {
        String a = "1+1i";
        String b = "1+1i";
        String c;

        ComplexNumberMultiplication haha = new ComplexNumberMultiplication();
        c = haha.complexNumberMultiply(a, b);
        System.out.println(c);
    }
}
