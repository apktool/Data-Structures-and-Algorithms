package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * 你可以按 任何顺序 返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combinations/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Combinations {
    public List<List<Integer>> solve01(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), n, k, 1);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> res, int n, int k, int idx) {
        if (res.size() == k) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int i = idx; i <= n; i++) {
            res.add(i);
            // 注意，这里是 i + 1，而不是 idx + 1，否则会出现重复的元素
            backtrack(list, res, n, k, i + 1);
            res.remove(res.size() - 1);
        }
    }
}
