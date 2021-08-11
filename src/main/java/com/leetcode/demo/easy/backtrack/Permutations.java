package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Permutations {
    public List<List<Integer>> solve01(int[] nums) {
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
            if (used[i]) {
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