package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-22 18:46
 * Implement int sqrt(int x).
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 */
public class Sqrt {
    public int mySqrt1(int x) {
        double val = x;
        double last;
        do {
            last = val;
            val = (val + x / val) / 2;
        } while (Math.abs(val - last) > 0.001);
        return (int) val;
    }

    public int mySqrt2(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1;
        int end = x;
        // Find the last postion whose square is <= x
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Same to mid * mid >x. Use divide to avoid overflow
            if (mid > x / mid) {
                end = mid;
            } else {
                start = mid;
            }
        }

        //Same to end * end >x. Use divide to avoid overflow
        if (end <= x / end) {
            return end;
        }
        return start;
    }

    public static void main(String[] args) {
        int x = 2147395599;
        int result;

        Sqrt sqrt = new Sqrt();

        result = sqrt.mySqrt1(x);
        System.out.println(result);

        result = sqrt.mySqrt2(x);
        System.out.println(result);
    }
}
