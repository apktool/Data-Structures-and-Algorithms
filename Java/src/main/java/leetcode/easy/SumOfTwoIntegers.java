package leetcode.easy;

/**
 * @author apktool
 * @date 2018-05-28 21:16
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 *
 * Note:
 * A summary: how to use bit manipulation to solve problems easily and efficiently
 * https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary:-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int c;
        while (b != 0) {
            c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        int result;

        SumOfTwoIntegers haha = new SumOfTwoIntegers();
        result = haha.getSum(a, b);
        System.out.println(result);
    }
}
