package leetcode.easy;

/**
 * @author apktool
 * @date 2018-05-23 21:31
 * *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * *
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Input: [2,1,1,2]
 * Output: 4
 * Explanation: Rob house 1 (money = 2) and then rob house 4 (money = 2).
 * Total amount you can rob = 2 + 2 = 4.
 */
public class HouseRobber {
    public int rob1(int[] nums) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even = Math.max(nums[i] + even, odd);
            } else {
                odd = Math.max(nums[i] + odd, even);
            }
        }

        return Math.max(even, odd);
    }

    public int rob2(int[] nums) {
        int prev = 0, curr = 0;
        for (int n : nums) {
            int tmp = curr;
            curr = Math.max(prev + n, curr);
            prev = tmp;
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int result;

        HouseRobber haha = new HouseRobber();

        result = haha.rob1(nums);
        System.out.println(result);

        result = haha.rob2(nums);
        System.out.println(result);
    }
}
