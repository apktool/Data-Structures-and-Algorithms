package leetcode.medium;

import lombok.*;

/**
 * @author apktool
 * @date 2018-07-16 22:22
 * *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 *
 * Input:
 *     2
 *    / \
 *   1   3
 * Output: true
 * Example 2:
 *
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * Output: false
 * Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
 *              is 5 but its right child's value is 4.
 */

public class ValidateBinarySearchTree {
    @Getter
    @Setter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    private int count;

    @Getter
    private TreeNode root;

    public void createBinaryTree(int[] values) {
        root = buildBinaryTree(values, count);
    }

    public TreeNode buildBinaryTree(int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(values[i]);
        root.setLeft(buildBinaryTree(values, ++count));
        root.setRight(buildBinaryTree(values, ++count));

        return root;
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isValidBSTHelper(root.getLeft(), Long.MIN_VALUE, root.getVal()) && isValidBSTHelper(root.getRight(), root.getVal(), Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }

        if (root.getVal() >= maxVal || root.getVal() <= minVal) {
            return false;
        }

        return isValidBSTHelper(root.getLeft(), minVal, root.getVal()) && isValidBSTHelper(root.getRight(), root.getVal(), maxVal);
    }

    public static void main(String[] args) {
        int[] values = {2, 1, -1, -1, 3, -1, -1};

        ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();

        vbst.createBinaryTree(values);
        boolean flag = vbst.isValidBST(vbst.getRoot());
        System.out.println(flag);
    }
}
