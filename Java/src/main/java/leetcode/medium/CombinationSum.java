package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author apktool
 * @date 2018-07-12 21:30
 * *
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * Example 2:
 *
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrace(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrace(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            list.add(new ArrayList<>(tempList));
        }

        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrace(list, tempList, candidates, target - candidates[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> list;

        CombinationSum cs = new CombinationSum();
        list = cs.combinationSum(candidates, target);
        System.out.println(list);
    }
}
