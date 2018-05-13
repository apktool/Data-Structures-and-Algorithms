package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-07 21:08
 * *
 * Implement atoi which converts a string to an integer.
 */
public class StringtoInteger {
    // 有问题
    public int myAtoi1(String str) {
        str = str.trim();
        int ch = 1;

        if (str == "") {
            return 0;
        }

        String val = "";
        if (str.charAt(0) == '-') {
            ch = -1;
            str = str.substring(1, str.length() - 1);
        }

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num >= 0 && num <= 9) {
                val += str.charAt(i);
            }
        }

        int result = 0;

        if (ch * Integer.valueOf(val) > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE - 1;
        }

        if (ch * Integer.valueOf(val) < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE + 1;
        }

        return result;
    }

    public int myAtoi2(String str) {
        int index = 0, sign = 1, total = 0;
        str = str.trim();
        //1. Empty string
        if (str.length() == 0) {
            return 0;
        }

        //2. Handle signs
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        //3. Convert number and avoid overflow
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            //check if total will be overflow after 10 times and add digit
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        String str = " 123asdf";
        int result;

        StringtoInteger haha = new StringtoInteger();
        result = haha.myAtoi1(str);
        System.out.println(result);

        result = haha.myAtoi2(str);
        System.out.println(result);
    }
}
