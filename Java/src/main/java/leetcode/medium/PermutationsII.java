package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-07-11 21:35
 * *
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * Example:
 *
 * Input: [1,1,2]
 * Output:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 */
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrace(list, new ArrayList<>(), nums, used);
        return list;
    }

    private void backtrace(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                tempList.add(nums[i]);
                backtrace(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list;

        PermutationsII pi = new PermutationsII();
        list = pi.permuteUnique(nums);
        System.out.println(list);
    }
}
