package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author li.wengang
 * @date 2018-10-29 00:12
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    @Getter
    @Setter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    public TreeNode createBinaryTree(int[] in, int[] post) {
        if (in == null || in.length == 0 || post == null || post.length == 0) {
            return null;
        }

        return buildBinaryTree(post, post.length - 1, in, 0, in.length - 1);
    }

    private TreeNode buildBinaryTree(int[] post, int idx, int[] in, int start, int end) {
        if (start > end || idx < 0) {
            return null;
        }

        TreeNode root = new TreeNode(post[idx]);

        int i;
        for (i = start; i <= end; i++) {
            if (in[i] == root.getVal()) {
                break;
            }
        }

        root.setRight(buildBinaryTree(post, idx - 1, in, i + 1, end));
        root.setLeft(buildBinaryTree(post, idx - (end - i + 1), in, start, i - 1));

        return root;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getVal() + " ");
        inorder(root.getRight());
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getVal() + " ");
    }

    public static void main(String[] args) {
        int[] array1 = {9, 3, 15, 20, 7};
        int[] array2 = {9, 15, 7, 20, 3};

        ConstructBinaryTreeFromInorderAndPostorderTraversal cbip = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode root = cbip.createBinaryTree(array1, array2);
        cbip.inorder(root);
        System.out.println();
        cbip.postorder(root);
    }
}
