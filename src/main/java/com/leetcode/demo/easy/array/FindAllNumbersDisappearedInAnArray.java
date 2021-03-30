package com.leetcode.demo.easy.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个范围在 1 ≤ a[i] ≤ n (n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class FindAllNumbersDisappearedInAnArray {
    /**
     * 哈希表
     *
     * @param nums
     * @return
     */
    public List<Integer> solve01(int[] nums) {
        Set<Integer> sets = new HashSet<>(nums.length);

        for (int num : nums) {
            if (!sets.contains(num)) {
                sets.add(num);
            }
        }

        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 1; i <= nums.length; i++) {
            if (!sets.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public List<Integer> solve02(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }

        boolean[] tables = new boolean[nums.length];
        for (int num : nums) {
            tables[num - 1] = true;
        }

        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < tables.length; i++) {
            if (!tables[i]) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
