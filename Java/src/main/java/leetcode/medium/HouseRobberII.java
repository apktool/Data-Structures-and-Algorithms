package leetcode.medium;

/**
 * @author apktool
 * @date 2018-05-25 20:59
 * *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 *
 * Input: [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
 * Example 2:
 *
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums.length == 0 ? 0 : nums[0];
        }

        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 1];
        if (start == 0) {
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
        } else {
            dp[1] = nums[1];
        }

        for (int i = 2; i < end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[end - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2};
        int result;

        HouseRobberII hii = new HouseRobberII();
        result = hii.rob(nums);
        System.out.println(result);
    }
}
