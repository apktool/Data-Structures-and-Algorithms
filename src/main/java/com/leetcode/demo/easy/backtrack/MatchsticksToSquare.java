package com.leetcode.demo.easy.backtrack;

/**
 * 还记得童话《卖火柴的小女孩》吗？现在，你知道小女孩有多少根火柴，请找出一种能使用所有火柴拼成一个正方形的方法。
 * 不能折断火柴，可以把火柴连接起来，并且每根火柴都要用到。
 * 输入为小女孩拥有火柴的数目，每根火柴用其长度表示。输出即为是否能用所有的火柴拼成正方形。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/matchsticks-to-square
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MatchsticksToSquare {
    public boolean solve01(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum == 0 || sum % 4 != 0) {
            return false;
        }

        return backtrack(nums, 0, sum / 4, new int[4]);
    }

    private boolean backtrack(int[] nums, int idx, int target, int[] res) {
        if (idx == nums.length) {
            return res[0] == res[1] && res[1] == res[2] && res[2] == res[3];
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] + nums[idx] > target) {
                continue;
            }

            res[i] += nums[idx];

            if (backtrack(nums, idx + 1, target, res)) {
                return true;
            }

            res[i] -= nums[idx];
        }

        return false;
    }
}
