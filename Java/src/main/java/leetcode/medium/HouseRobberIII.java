package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author li.wengang
 * @date 2018-11-14 23:23
 * *
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area,
 * called the "root." Besides the root, each house has one and only one parent house. After a tour,
 * the smart thief realized that "all houses in this place forms a binary tree".
 * It will automatically contact the police if two directly-linked houses were broken into on the same night.
 *
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 *
 * Example 1:
 * Input: [3,2,3,null,3,null,1]
 *
 *      3
 *     / \
 *    2   3
 *     \   \
 *      3   1
 *
 * Output: 7
 * Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 *
 * Example 2:
 * Input: [3,4,5,1,3,null,1]
 *
 *      3
 *     / \
 *    4   5
 *   / \   \
 *  1   3   1
 *
 * Output: 9
 * Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
 *
 * *
 * https://leetcode.com/problems/house-robber-iii/discuss/79437/C%2B%2B-JAVA-PYTHON-and-explanation
 */

public class HouseRobberIII {
    @Getter
    @Setter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    @Getter
    private TreeNode root;
    private int count;

    public void createBinaryTree(int[] values) {
        this.root = buildBinaryTree(values, count);
    }

    private TreeNode buildBinaryTree(int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(values[i]);
        root.setLeft(buildBinaryTree(values, ++count));
        root.setRight(buildBinaryTree(values, ++count));

        return root;
    }

    // 这种方法效率很低
    public int rob1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(robInclude(root), robExclude(root));
    }

    public int robInclude(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return robExclude(root.getLeft()) + robExclude(root.getRight()) + root.getVal();
    }

    public int robExclude(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return rob1(node.getLeft()) + rob1(node.getRight());
    }

    public int rob2(TreeNode root) {
        int[] tmp = dfs(root);
        return Math.max(tmp[0], tmp[1]);
    }

    public int[] dfs(TreeNode root) {
        int[] res = new int[2];
        if (root == null) {
            return res;
        }
        int[] left = dfs(root.getLeft());
        int[] right = dfs(root.getRight());
        res[1] = left[0] + right[0] + root.getVal();
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }

    public static void main(String[] args) {
        int[] values = {3, 4, 1, -1, -1, 3, -1, -1, 5, -1, 1, -1, -1};
//        int[] values = {3, 2, -1, 3, -1, -1, 3, -1, 1, -1, -1};

        HouseRobberIII hr = new HouseRobberIII();
        hr.createBinaryTree(values);
        int result;

        result = hr.rob1(hr.getRoot());
        System.out.println(result);

        result = hr.rob2(hr.getRoot());
        System.out.println(result);
    }
}
