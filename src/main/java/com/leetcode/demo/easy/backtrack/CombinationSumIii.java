package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1-9 的正整数，并且每种组合中不存在重复的数字。
 * 说明：
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class CombinationSumIii {
    public List<List<Integer>> solve01(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), k, n, 1);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, int k, int n, int idx) {
        if (n == 0 && k == 0) {
            list.add(new ArrayList<>(res));
            return;
        }

        if (k == 0) {
            return;
        }

        for (int i = idx; i <= 9; i++) {
            res.add(i);
            backtrack(list, res, k - 1, n - i, i + 1);
            res.remove(res.size() - 1);
        }
    }
}
