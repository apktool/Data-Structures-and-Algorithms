package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author apktool
 * @date 2018-07-10 22:30
 * *
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *   Input: nums = [1,2,3]
 *   Output:
 *     [
 *       [3],
 *       [1],
 *       [2],
 *       [1,2,3],
 *       [1,3],
 *       [2,3],
 *       [1,2],
 *       []
 *     ]
 */
public class Subsets {
    public List<List<Integer>> subSets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list;

        Subsets ss = new Subsets();
        list = ss.subSets(nums);
        System.out.println(list);
    }
}