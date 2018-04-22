package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-22 11:23
 * *
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * *
 * Example:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {
    public String addBinary1(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int i = 0, carry = 0;
        String res = "";

        while (i < lena || i < lenb || carry != 0) {
//            int x = (i < lena) ? a.charAt(lena - 1 - i) - 48 : 0;
            int x = (i < lena) ? Character.getNumericValue(a.charAt(lena - 1 - i)) : 0;
            int y = (i < lenb) ? Character.getNumericValue(b.charAt(lenb - 1 - i)) : 0;
            res = (x + y + carry) % 2 + res;
            carry = (x + y + carry) / 2;
            i++;
        }
        return res;
    }

    public String addBinary2(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int ai = ac.length - 1;
        int bi = bc.length - 1;
        int maxLength = Math.max(ai, bi);
        char[] result = new char[maxLength + 1];
        int sum = 0;
        while (ai >= 0 || bi >= 0) {
            if (ai >= 0) {
                sum += ac[ai--] - '0';
            }

            if (bi >= 0) {
                sum += bc[bi--] - '0';
            }

            result[maxLength--] = (char) (sum % 2 + 48);
            sum /= 2;
        }

        String r = new String(result);
        if (sum == 1) {
            r = sum + r;
        }
        return r;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String result;

        AddBinary addBinary = new AddBinary();

        result = addBinary.addBinary1(a, b);
        System.out.println(result);

        result = addBinary.addBinary2(a, b);
        System.out.println(result);
    }
}
