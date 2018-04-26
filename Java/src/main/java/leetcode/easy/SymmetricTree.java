package leetcode.easy;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author apktool
 * @date 2018-04-26 21:42
 * *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 */


@Data
class TreeNode {
    @NonNull
    int val;
    TreeNode left;
    TreeNode right;
}

class BinaryTree {
    @Getter
    transient TreeNode root;

    private int count = 0;

    public void buildBinaryTree(int[] values) {
        root = createBinaryTree(root, values, 0);
    }

    private TreeNode createBinaryTree(TreeNode root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNode(values[i]);
        root.setLeft(createBinaryTree(root.getLeft(), values, ++count));
        root.setRight(createBinaryTree(root.getRight(), values, ++count));

        return root;
    }
}

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricHelper(root.getLeft(), root.getRight());
    }

    public boolean isSymmetricHelper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.getVal() == q.getVal()) {
            return isSymmetricHelper(p.getLeft(), q.getRight()) && isSymmetricHelper(p.getRight(), q.getLeft());
        }

        return false;
    }

    public static void main(String[] args) {
        // int[] a = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        int[] a = {1, 2, 3, -1, -1, 4, -1, -1, 2, 4, -1, -1, 3, -1, -1};

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.buildBinaryTree(a);

        TreeNode root = binaryTree.getRoot();

        SymmetricTree symmetricTree = new SymmetricTree();
        boolean flag = symmetricTree.isSymmetric(root);
        System.out.println(flag);
    }
}
