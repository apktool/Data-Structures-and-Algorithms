package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class SubsetsIi {
    public List<List<Integer>> solve01(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(nums.length * 2);
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), new boolean[nums.length], nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, boolean[] visited, int[] nums, int idx) {
        list.add(new ArrayList<>(res));

        if (res.size() == nums.length) {
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i] && !visited[i - 1]) {
                continue;
            }

            visited[i] = true;
            res.add(nums[i]);
            backtrack(list, res, visited, nums, i + 1);
            res.remove(res.size() - 1);
            visited[i] = false;
        }
    }
}
