package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author acronymor
 * @date 2018-04-12 20:55
 *
 * *
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public boolean isPalindrome1(int x) {
        List<String> y = Arrays.asList(String.valueOf(x).split(""));
        List<String> temp = new ArrayList<String>(y);
        Collections.reverse(temp);
        return temp.equals(y);
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int result = 0;

        while (x > result) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return x == result || x == result / 10;
    }

    public static void main(String[] args) {
        int x = 123321;
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean flag;

        flag = palindromeNumber.isPalindrome1(x);
        System.out.println(flag);

        flag = palindromeNumber.isPalindrome2(x);
        System.out.println(flag);
    }
}
