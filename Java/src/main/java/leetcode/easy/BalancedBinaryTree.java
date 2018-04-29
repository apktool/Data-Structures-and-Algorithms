package leetcode.easy;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author apktool
 * @date 2018-04-29 17:51
 * *
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 * Example 1:
 * Given the following tree [3,9,20,null,null,15,7]:
 *      3
 *     / \
 *    9  20
 *    /  \
 *  15   7
 * Return true.
 *
 * Example 2:
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *        1
 *       / \
 *      2  2
 *     / \
 *    3  3
 *   / \
 *  4  4
 * Return false.
 */

@Data
class TreeNodeBBT {
    @NonNull
    int val;
    TreeNodeBBT lchild;
    TreeNodeBBT rchild;
}

class BinaryTreeBBT {
    @Getter
    transient TreeNodeBBT root;
    int count = 0;

    public TreeNodeBBT buildBinaryTree(int[] values) {
        return createBinaryTree(root, values, count);
    }

    public TreeNodeBBT createBinaryTree(TreeNodeBBT root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNodeBBT(values[i]);

        root.setLchild(createBinaryTree(root.getLchild(), values, ++count));
        root.setRchild(createBinaryTree(root.getRchild(), values, ++count));

        return root;
    }

    public void preOrder(TreeNodeBBT root) {
        if (root == null) {
            return;
        }
        System.out.printf("%d ", root.getVal());
        preOrder(root.getLchild());
        preOrder(root.getRchild());
    }

    public void inOrder(TreeNodeBBT root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLchild());
        System.out.printf("%d ", root.getVal());
        inOrder(root.getRchild());
    }
}

public class BalancedBinaryTree {
    private boolean flag = true;

    public boolean isBalanced(TreeNodeBBT root) {
        if (root == null) {
            return true;
        }

        int result = isBalancedHelper(root);
        System.out.println(result);

        return flag;
    }

    public int isBalancedHelper(TreeNodeBBT root) {

        if (root == null) {
            return 0;
        }

        int left = isBalancedHelper(root.getLchild());
        int right = isBalancedHelper(root.getRchild());

        if (Math.abs(left - right) >= 2) {
            flag = false;
        }

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
//        int[] valus = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        int[] valus = {1, 2, 3, 4, -1, -1, -1, -1, 2, -1, 3, -1, 4, -1, -1};
        boolean flag;

        BinaryTreeBBT binaryTreeBBT = new BinaryTreeBBT();
        TreeNodeBBT root = binaryTreeBBT.buildBinaryTree(valus);

        BalancedBinaryTree haha = new BalancedBinaryTree();
        flag = haha.isBalanced(root);
        System.out.println(flag);
    }
}
