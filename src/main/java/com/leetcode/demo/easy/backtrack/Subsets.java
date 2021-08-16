package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Subsets {
    public List<List<Integer>> solve01(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, int[] nums, int idx) {
        list.add(new ArrayList<>(res));

        if (res.size() == nums.length) {
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            res.add(nums[i]);
            backtrack(list, res, nums, i + 1);
            res.remove(res.size() - 1);
        }
    }
}
