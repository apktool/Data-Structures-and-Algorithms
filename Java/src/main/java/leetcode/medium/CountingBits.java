package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-27 22:47
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's
 * in their binary representation and return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] answer = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            answer[i] = answer[i >> 1] + (i & 1);
        }
        return answer;
    }

    public void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 5;
        int[] result;

        CountingBits cb = new CountingBits();
        result = cb.countBits(num);
        cb.display(result);
    }
}
