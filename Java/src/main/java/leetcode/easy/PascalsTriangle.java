package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apktool
 * @date 2018-04-29 22:41
 * *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * Input: 5
 * Output:
 * [
 *       [1],
 *      [1,1],
 *     [1,2,1],
 *    [1,3,3,1],
 *   [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayListOut = new ArrayList(numRows);

        if (numRows < 1) {
            return arrayListOut;
        }

        arrayListOut.add(new ArrayList<Integer>());
        arrayListOut.get(0).add(1);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> arrayListIn = new ArrayList(i);
            arrayListIn.add(0, 1);

            for (int j = 1; j < i - 1; j++) {
                List<Integer> temp = arrayListOut.get(i - 2);
                arrayListIn.add(j, temp.get(j - 1) + temp.get(j));
            }

            arrayListIn.add(i - 1, 1);
            arrayListOut.add(i - 1, arrayListIn);
        }

        return arrayListOut;
    }

    public static void main(String[] args) {
        int numRows = 5;

        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.generate(numRows);
        System.out.println(result);

    }
}
