package leetcode.easy;

import java.util.HashMap;

/**
 * @author acronymor
 * @date 2018-04-11 20:55
 * <p>
 * *
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {

        int[] result = new int[2];
        System.out.println("------");

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public int[] twoSum2(int[] nums, int target) {

        int[] result = new int[2];

        if (nums == null || nums.length < 2) {
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] result = new int[2];

        result = twoSum.twoSum1(nums, target);
        System.out.printf("%d - %d\n", result[0], result[1]);

        System.out.println("-----");

        result = twoSum.twoSum2(nums, target);
        System.out.printf("%d - %d\n", result[0], result[1]);
    }
}
