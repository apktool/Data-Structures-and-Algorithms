package leetcode.medium;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author li.wengang
 * @date 2018-11-01 17:38
 * *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * Return:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class PathSumII {
    @Setter
    @Getter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    private int count;

    public TreeNode createBinaryNode(int[] values) {
        return createBinaryNodeHelper(values, 0);
    }

    private TreeNode createBinaryNodeHelper(int[] array, int i) {
        if (array[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(array[i]);
        root.setLeft(createBinaryNodeHelper(array, ++count));
        root.setRight(createBinaryNodeHelper(array, ++count));

        return root;
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        pathSumHelper(list, new ArrayList<>(), root, sum);

        return list;
    }

    public void pathSumHelper(List<List<Integer>> list, List<Integer> tmp, TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        tmp.add(root.getVal());

        if (root.getVal() == sum && root.getLeft() == null && root.getRight() == null) {
            list.add(new ArrayList<>(tmp));
            tmp.remove(tmp.size() - 1);
            return;
        }
        pathSumHelper(list, tmp, root.getLeft(), sum - root.getVal());
        pathSumHelper(list, tmp, root.getRight(), sum - root.getVal());

        tmp.remove(tmp.size() - 1);
    }

    public static void main(String[] args) {
        int[] values = {5, 4, 11, 7, -1, -1, 2, -1, -1, -1, 8, 13, -1, -1, 4, 5, -1, -1, 1, -1, -1};
        int sum = 22;

        PathSumII pathSumII = new PathSumII();
        TreeNode root = pathSumII.createBinaryNode(values);
        List<List<Integer>> list = pathSumII.pathSum(root, sum);
        list.forEach(System.out::println);
    }
}
