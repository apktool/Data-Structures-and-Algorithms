package leetcode.easy;

/**
 * @author apktool
 * @date 2018-05-01 16:35
 * *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }

        int result = 0;
        for(int num: nums) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result;

        SingleNumber hah = new SingleNumber();
        result = hah.singleNumber(nums);
        System.out.println(result);
    }
}
