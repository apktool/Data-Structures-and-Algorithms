package com.leetcode.demo.easy.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * 格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。
 * 给定一个代表编码总位数的非负整数 n，打印其格雷编码序列。即使有多个不同答案，你也只需要返回其中一种。
 * 格雷编码序列必须以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/gray-code
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class GrayCode {
    public List<Integer> solve01(int n) {
        List<Integer> res = new ArrayList<>();
        backtrack1(res, new StringBuilder(), n, new int[]{0, 1});
        return res;
    }

    private void backtrack1(List<Integer> list, StringBuilder builder, int n, int[] nums) {
        if (builder.length() == n) {
            Integer tmp = Integer.valueOf(builder.toString(), 2);
            list.add(tmp);
            return;
        }

        builder.append(nums[0]);
        backtrack1(list, builder, n, new int[]{0, 1});
        builder.deleteCharAt(builder.length() - 1);

        builder.append(nums[1]);
        backtrack1(list, builder, n, new int[]{1, 0});
        builder.deleteCharAt(builder.length() - 1);
    }

    public List<Integer> solve02(int n) {
        List<Integer> list = new ArrayList();
        backtrack2(list, n, 0, 0, true);
        return list;
    }

    public void backtrack2(List<Integer> list, int n, int i, int current, boolean isEven) {
        if (i == n) {
            list.add(current);
            return;
        }

        if (isEven) {
            backtrack2(list, n, i + 1, current << 1, true);
            backtrack2(list, n, i + 1, (current << 1) + 1, false);
        } else {
            backtrack2(list, n, i + 1, (current << 1) + 1, true);
            backtrack2(list, n, i + 1, current << 1, false);
        }
    }
}
