package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组candidates和一个目标数target，找出candidates中所有可以使数字和为target的组合。
 * candidates中的每个数字在每个组合中只能使用一次。
 * 注意：解集不能包含重复的组合。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSumIi {
    public List<List<Integer>> solve01(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> list = new ArrayList<>(candidates.length);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, int[] candidates, int target, int idx) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            // 大剪枝：减去 candidates[i] 小于 0，减去后面的 candidates[i + 1]、candidates[i + 2] 肯定也小于 0，因此用 break
            if (target - candidates[i] < 0) {
                break;
            }

            // 小剪枝：同一层相同数值的结点，从第 2 个开始，候选数更少，结果一定发生重复，因此跳过，用 continue
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }

            res.add(candidates[i]);
            backtrack(list, res, candidates, target - candidates[i], i + 1);
            res.remove(res.size() - 1);
        }
    }
}
