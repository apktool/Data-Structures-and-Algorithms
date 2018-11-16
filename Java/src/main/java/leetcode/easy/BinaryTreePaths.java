package leetcode.easy;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

/**
 * @author li.wengang
 * @date 2018-11-16 23:33
 * *
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class BinaryTreePaths {
    @Setter
    @Getter
    @RequiredArgsConstructor
    public class TreeNode {
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

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> list = new LinkedList<>();

        if (root == null) {
            return list;
        }

        binaryTreePathsHelper(root, list, "");
        return list;
    }

    private void binaryTreePathsHelper(TreeNode root, List<String> list, String str) {
        if (root == null) {
            list.add(str.substring(0, str.length() - 2));
            return;
        }

        str = str + root.getVal() + "->";
        binaryTreePathsHelper(root.getLeft(), list, str);
        binaryTreePathsHelper(root.getRight(), list, str);

        list.remove(str.substring(0, str.length() - 2));
    }

    public static void main(String[] args) {
        int[] values = {1, 2, -1, 5, -1, -1, 3, -1, -1};

        BinaryTreePaths btp = new BinaryTreePaths();
        btp.createBinaryTree(values);

        List<String> list = btp.binaryTreePaths(btp.getRoot());
        System.out.println(list);
    }
}
