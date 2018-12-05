package leetcode.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author li.wengang
 * @date 2018-12-01 23:35
 * *
 * Remember the story of Little Match Girl? By now, you know exactly what matchsticks the little match girl has,
 * please find out a way you can make one square by using up all those matchsticks.
 * You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.
 *
 * Your input will be several matchsticks the girl has, represented with their stick length.
 * Your output will either be true or false, to represent whether you could make one square using all the matchsticks the little match girl has.
 *
 * Example 1:
 * Input: [1,1,2,2,2]
 * Output: true
 *
 * Explanation: You can form a square with length 2, one side of the square came two sticks with length 1.
 * Example 2:
 * Input: [3,3,3,3,4]
 * Output: false
 *
 * Explanation: You cannot find a way to form a square with all the matchsticks.
 * Note:
 * The length sum of the given matchsticks is in the range of 0 to 10^9.
 * The length of the given matchstick array will not exceed 15.
 * *
 * https://www.wikiwand.com/en/Partition_problem
 */
public class MatchsticksToSquare {
    // 1026 ms
    public boolean makesquare1(int[] nums) {
        if (nums == null || nums.length < 4) {
            return false;
        }
        int sum = IntStream.of(nums).sum();

        if (sum % 4 != 0) {
            return false;
        }

        return backstrace(nums, new int[4], 0, sum / 4);
    }

    private boolean backstrace(int[] nums, int[] sums, int index, int target) {
        if (index == nums.length) {
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sums[i] + nums[index] > target) {
                continue;
            }
            sums[i] += nums[index];
            if (backstrace(nums, sums, index + 1, target)) {
                return true;
            }
            sums[i] -= nums[index];
        }

        return false;
    }

    // 7 ms
    public boolean makesquare2(int[] nums) {
        if (nums == null || nums.length < 4) {
            return false;
        }
        int sum = IntStream.of(nums).sum();
        if (sum % 4 != 0) {
            return false;
        }
        Arrays.sort(nums);
        return dfs(nums, sum / 4, sum / 4, 0, false);
    }

    private boolean dfs(int[] nums, int side, int remain, int count, boolean minusOne) {
        if (count == 4) {
            return true;
        }

        if (remain == 0) {
            return dfs(nums, side, side, count + 1, true);
        }

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] != -1 && nums[i] <= remain) {
                int original = nums[i];
                nums[i] = -1;
                if (dfs(nums, side, remain - original, count, true)) {
                    return true;
                }
                if (!minusOne) {
                    return false;
                }
                nums[i] = original;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2};
        boolean res;

        MatchsticksToSquare msts = new MatchsticksToSquare();
        res = msts.makesquare1(nums);
        System.out.println(res);

        res = msts.makesquare2(nums);
        System.out.println(res);
    }
}
