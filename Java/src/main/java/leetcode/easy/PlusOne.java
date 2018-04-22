package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-22 09:59
 * *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */

public class PlusOne {
    // 这种解决方法存在问题，比如数组digits足够长，会导致转换为int/long后失真。
    public int[] plusOne1(int[] digits) {
        long n = 0;
        for (int i = 0; i < digits.length; i++) {
            n = 10 * n + digits[i];
        }

        char[] nums = String.valueOf(++n).toCharArray();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = (int) (nums[i] - 48);
        }

        return result;
    }

    public int[] plusOne2(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[length + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public void display(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] digits1 = new int[]{1, 2, 3};
        int[] result;

        PlusOne plusOne = new PlusOne();

        result = plusOne.plusOne1(digits1);
        plusOne.display(result);

        int[] digits2 = new int[]{9, 9, 9};
        result = plusOne.plusOne2(digits2);
        plusOne.display(result);
    }
}
