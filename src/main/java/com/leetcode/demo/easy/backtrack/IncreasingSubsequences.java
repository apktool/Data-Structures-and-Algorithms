package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 给你一个整数数组 nums ，找出并返回所有该数组中不同的递增子序列，递增子序列中至少有两个元素 。你可以按任意顺序 返回答案。
 * 数组中可能含有重复元素，如出现两个整数相等，也可以视作递增序列的一种特殊情况。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-subsequences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IncreasingSubsequences {
    public List<List<Integer>> solve01(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, int[] nums, int idx) {
        if (res.size() > 1) {
            list.add(new ArrayList<>(res));
        }

        HashSet<Integer> uset = new HashSet<>();

        for (int i = idx; i < nums.length; i++) {
            if ((!res.isEmpty() && nums[i] < res.get(res.size() - 1)) || !uset.add(nums[i])) {
                continue;
            }
            res.add(nums[i]);
            backtrack(list, res, nums, i + 1);
            res.remove(res.size() - 1);
        }
    }
}
