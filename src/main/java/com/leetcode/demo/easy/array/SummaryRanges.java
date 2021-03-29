package com.leetcode.demo.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个无重复元素的有序整数数组 nums 。
 * <p>
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 * <p>
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 * <p>
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/summary-ranges
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class SummaryRanges {
    public List<String> solve01(int[] nums) {
        int i = 0;
        int j = 0;
        List<String> list = new ArrayList<>();

        while (j < nums.length) {
            if (j + 1 == nums.length) {
                list.add(convert(nums[i], nums[j]));
                break;
            }

            if (nums[j] + 1 != nums[j + 1]) {
                list.add(convert(nums[i], nums[j]));
                i = j + 1;
            }
            j++;
        }

        return list;
    }

    private String convert(int a, int b) {
        if (a == b) {
            return String.valueOf(a);
        } else {
            return String.format("%d->%d", a, b);
        }
    }
}
