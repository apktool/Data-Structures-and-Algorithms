package com.leetcode.demo.easy.array;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class PascalsTriangle2 {
    public List<Integer> solve01(int rowIndex) {
        Integer[] array = new Integer[rowIndex + 1];

        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0 || j == i) {
                    array[j] = 1;
                } else {
                    array[j] = array[j - 1] + array[j];
                }
            }
        }

        return Arrays.asList(array);
    }
}
