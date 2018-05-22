package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-05-21 21:46
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 *
 * Note:
 *
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */
public class Triangle {
    public int minimumTotal2(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];

        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                dp[j] = list.get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        List<Integer> list1 = new ArrayList<Integer>(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<Integer>(2);
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<Integer>(3);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<Integer>(4);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);


        Triangle haha = new Triangle();
        int result;

        result = haha.minimumTotal2(list);
        System.out.println(result);
    }
}
