package leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-05-13 20:54
 * *
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * Example:
 * <p>
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
    public int threeSum(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);

        int count = 0;
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                int lo = i + 1, hi = nums.length - 1;
                while (lo < hi) {
                    int sum = nums[lo] + nums[hi] + nums[i];
                    if(sum > target) {
                        hi--;
                    } else {
                        lo++;
                    }

                    if(Math.abs(sum - target) < Math.abs(result - target)) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, -3};
        int target = 1;

        ThreeSumClosest haha = new ThreeSumClosest();
        int res = haha.threeSum(nums, target);
        System.out.println(res);
    }
}
