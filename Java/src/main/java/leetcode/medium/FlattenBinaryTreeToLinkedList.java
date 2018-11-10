package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author li.wengang
 * @date 2018-11-01 23:51
 * *
 * Given a binary tree, flatten it to a linked list in-place.
 *
 * For example, given the following tree:
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * The flattened tree should look like:
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 */
public class FlattenBinaryTreeToLinkedList {
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

    public TreeNode createBinaryTree(int[] values) {
        return createBinaryTreeHelper(values, count);
    }

    private TreeNode createBinaryTreeHelper(int[] array, int i) {
        if(array[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(array[i]);

        root.setLeft(createBinaryTreeHelper(array, ++count));
        root.setRight(createBinaryTreeHelper(array, ++count));

        return root;
    }

    private TreeNode pre = null;

    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }

        flatten(root.getRight());
        flatten(root.getLeft());

        root.setRight(pre);
        root.setLeft(null);
        pre = root;
    }

    public void preorder(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getVal() + " ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};


        FlattenBinaryTreeToLinkedList fl = new FlattenBinaryTreeToLinkedList();
        TreeNode root = fl.createBinaryTree(values);
        fl.flatten(root);
        fl.preorder(root);
    }
}
