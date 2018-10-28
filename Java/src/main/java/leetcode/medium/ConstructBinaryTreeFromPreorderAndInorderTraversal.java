package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author li.wengang
 * @date 2018-10-21 23:36
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    @Getter
    @Setter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    public TreeNode createBinaryTree(int[] array1, int[] array2) {
        return buildBinaryTree(0, 0, array2.length - 1, array1, array2);
    }

    public TreeNode buildBinaryTree(int preStart, int inStart,  int inEnd, int[] preArray, int[] inArray) {
        if(preStart > preArray.length - 1 || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preArray[preStart]);
        int inIndex = 0;

        for (int i = inStart; i <= inEnd; i++) {
            if (inArray[i] == root.getVal()) {
                inIndex = i;
            }
        }

        root.setLeft(buildBinaryTree(preStart + 1, inStart, inIndex - 1, preArray, inArray));
        root.setRight(buildBinaryTree( preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preArray, inArray));

        return root;
    }

    public void preorder(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.getVal() + " ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }

        inorder(root.getLeft());
        System.out.print(root.getVal() + " ");
        inorder(root.getRight());
    }

    public static void main(String[] args) {
        int[] array1 = {3, 9, 20, 15, 7};
        int[] array2 = {9, 3, 15, 20, 7};

        ConstructBinaryTreeFromPreorderAndInorderTraversal cbpi = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        TreeNode root = cbpi.createBinaryTree(array1, array2);
        cbpi.preorder(root);
        System.out.println();
        cbpi.inorder(root);
    }

}
