package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class MajorityElement {
    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public int solve01(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int res = map.get(nums[i]);
                if (res >= nums.length / 2) {
                    return nums[i];
                }
                map.put(nums[i], res + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        return nums[0];
    }

    /**
     * 排序
     *
     * @param nums
     * @return
     */
    public int solve02(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 摩尔投票法
     * 遇到相同的数，就投一票，遇到不同的数，就减一票，最后还存在票的数就是众数
     *
     * @param nums
     * @return
     */
    public int solve03(int[] nums) {
        int count = 0, result = -1;
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            if (num == result) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }
}
