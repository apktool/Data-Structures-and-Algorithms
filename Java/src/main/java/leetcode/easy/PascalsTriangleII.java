package leetcode.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author apktool
 * @date 2018-04-29 22:41
 * *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * Note that the row index starts from 0.
 * [
 *       [1],
 *      [1,1],
 *     [1,2,1],
 *    [1,3,3,1],
 * ]
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */

public class PascalsTriangleII {
    public List<Integer> generate(int rowIndex) {
        Integer[] arr = new Integer[rowIndex + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for (int i = 1; i <= rowIndex; i++)
            for (int j = i; j > 0; j--)
                arr[j] = arr[j] + arr[j - 1];

        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        int rowIndex = 3;

        PascalsTriangleII pt = new PascalsTriangleII();
        List<Integer> result = pt.generate(rowIndex);
        System.out.println(result);
    }
}
