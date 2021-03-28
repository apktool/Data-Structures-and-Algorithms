package com.leetcode.demo.easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class ContainsDuplicate2 {
    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public boolean solve01(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (i - j <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
