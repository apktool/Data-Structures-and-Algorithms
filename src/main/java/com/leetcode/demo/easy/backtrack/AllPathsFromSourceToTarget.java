package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个有n个节点的 有向无环图（DAG），请你找出所有从节点 0到节点 n-1的路径并输出（不要求按特定顺序）
 * 二维数组的第 i 个数组中的单元都表示有向图中 i 号节点所能到达的下一些节点，空就是没有下一个结点了。
 * 译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/all-paths-from-source-to-target
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AllPathsFromSourceToTarget {
    public List<List<Integer>> solve01(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>(graph.length * 2);
        backtrace01(res, new ArrayList<>() {{
            add(0);
        }}, graph, 0);
        return res;
    }

    private void backtrace01(List<List<Integer>> list, List<Integer> res, int[][] nums, int idx) {
        if (idx == nums.length - 1) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int i = 0; i < nums[idx].length; i++) {
            res.add(nums[idx][i]);
            backtrace01(list, res, nums, nums[idx][i]);
            res.remove(res.size() - 1);
        }
    }

    public List<List<Integer>> solve02(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>(graph.length * 2);
        backtrace02(res, new ArrayList<>(), graph, 0);
        return res;
    }

    private void backtrace02(List<List<Integer>> list, List<Integer> res, int[][] nums, int idx) {
        res.add(idx);

        if (idx == nums.length - 1) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int num : nums[idx]) {
            backtrace02(list, res, nums, num);
            res.remove(res.size() - 1);
        }
    }

}