package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个无重复元素的正整数数组candidates和一个正整数target，找出candidates中所有可以使数字和为目标数target的唯一组合。
 * candidates中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。
 * 对于给定的输入，保证和为target 的唯一组合数少于 150 个。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSum {
    public List<List<Integer>> solve01(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>(candidates.length);
        backtrack1(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack1(List<List<Integer>> list, List<Integer> res, int[] candidates, int target, int idx) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            res.add(candidates[i]);
            backtrack1(list, res, candidates, target - candidates[i], i);
            res.remove(res.size() - 1);
        }
    }

    public List<List<Integer>> solve02(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>(candidates.length);
        backtrack2(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack2(List<List<Integer>> list, List<Integer> res, int[] candidates, int target, int idx) {
        if (idx == candidates.length) {
            return;
        }

        if (target == 0) {
            list.add(new ArrayList<>(res));
            return;
        }

        backtrack2(list, res, candidates, target, idx + 1);
        if (target - candidates[idx] >= 0) {
            res.add(candidates[idx]);
            backtrack2(list, res, candidates, target - candidates[idx], idx);
            res.remove(res.size() - 1);
        }
    }

}
