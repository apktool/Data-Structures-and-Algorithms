package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class PermutationsIi {
    public List<List<Integer>> solve01(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>(nums.length);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length], 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, int[] nums, boolean[] used, int idx) {
        if (idx == nums.length) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            res.add(nums[i]);
            backtrack(list, res, nums, used, idx + 1);
            res.remove(res.size() - 1);
            used[i] = false;
        }
    }
}
