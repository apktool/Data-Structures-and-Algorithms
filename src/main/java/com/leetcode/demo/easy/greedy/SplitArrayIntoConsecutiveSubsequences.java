package com.leetcode.demo.easy.greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个按升序排序的整数数组 num（可能包含重复数字），请你将它们分割成一个或多个长度至少为 3 的子序列，其中每个子序列都由连续整数组成。
 * 如果可以完成上述分割，则返回 true ；否则，返回 false 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class SplitArrayIntoConsecutiveSubsequences {
    public boolean solve01(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0);
            if (count <= 0) {
                continue;
            }

            int prevEndCount = endMap.getOrDefault(num - 1, 0);
            if (prevEndCount > 0) {
                countMap.put(num, count - 1);
                endMap.put(num - 1, prevEndCount - 1);
                endMap.put(num, endMap.getOrDefault(num, 0) + 1);
            } else {
                int count1 = countMap.getOrDefault(num + 1, 0);
                int count2 = countMap.getOrDefault(num + 2, 0);

                if (count1 > 0 && count2 > 0) {
                    countMap.put(num, count - 1);
                    countMap.put(num + 1, count1 - 1);
                    countMap.put(num + 2, count2 - 1);
                    endMap.put(num + 2, endMap.getOrDefault(num + 2, 0) + 1);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
