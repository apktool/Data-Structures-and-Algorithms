package leetcode.easy;

/**
 * @author apktool
 * @date 2018-04-28 20:26
 * *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Example:
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
class TreeNodeST {
    @NonNull
    int val;
    TreeNodeST lchild;
    TreeNodeST rchild;
}

class BinaryTreeST {

    @Getter
    transient TreeNodeST root;

    public void buildBinaryTree(int[] values) {
        if (values.length == 0) {
            return;
        }

        root = createBinaryTree(root, values, 0, values.length - 1);
    }

    public TreeNodeST createBinaryTree(TreeNodeST root, int[] values, int start, int end) {
        if(start > end) {
            return null;
        }

        int middle = (end + start + 1) / 2;
        root = new TreeNodeST(values[middle]);

        root.setLchild(createBinaryTree(root.getLchild(), values, start, middle - 1));
        root.setRchild(createBinaryTree(root.getRchild(), values, middle + 1, end));

        return root;
    }

    public void preOrder(TreeNodeST root) {
        if(root == null) {
            return;
        }

        System.out.printf("%d ", root.getVal());
        preOrder(root.getLchild());
        preOrder(root.getRchild());
    }

    public void inOrder(TreeNodeST root) {
        if(root == null) {
            return;
        }

        inOrder(root.getLchild());
        System.out.printf("%d ", root.getVal());
        inOrder(root.getRchild());
    }
}

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNodeST sortedArrayToBST(int[] nums) {
        BinaryTreeST binaryTreeST = new BinaryTreeST();
        binaryTreeST.buildBinaryTree(nums);

        return binaryTreeST.getRoot();
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        ConvertSortedArraytoBinarySearchTree haha = new ConvertSortedArraytoBinarySearchTree();
        BinaryTreeST binaryTreeST = new BinaryTreeST();

        TreeNodeST root = haha.sortedArrayToBST(nums);

        binaryTreeST.preOrder(root);
        System.out.println();
        binaryTreeST.inOrder(root);
    }
}
