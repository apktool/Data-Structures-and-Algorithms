package leetcode.medium;

/**
 * @author apktool
 * @date 2018-07-08 14:45
 * *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * Example:
 *
 * Input: [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2.
 * Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * *
 * Note:
 *
 * You can assume that you can always reach the last index.
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int cf = 0, ce = 0;
        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            cf = Math.max(cf, i + nums[i]);
            if(i == ce) {
                ce = cf;
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 1, 4};
        int step;

        JumpGameII haha = new JumpGameII();
        step = haha.jump(nums);
        System.out.println(step);
    }
}
