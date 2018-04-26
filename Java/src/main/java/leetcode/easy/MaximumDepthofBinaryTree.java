package leetcode.easy;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author apktool
 * @date 2018-04-26 22:18
 * *
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *   3
 *  / \
 * 9  20
 * /  \
 * 15   7
 * return its depth = 3.
 */
@Data
class TreeNodeMD {
    @NonNull
    int val;
    TreeNodeMD left;
    TreeNodeMD right;
}

class BinaryTreeMD {

    @Getter
    transient TreeNodeMD root;

    private int count = 0;

    public void buildBinaryTree(int[] values) {
        root = createBinaryTree(root, values, 0);
    }

    private TreeNodeMD createBinaryTree(TreeNodeMD root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNodeMD(values[i]);
        root.setLeft(createBinaryTree(root.getLeft(), values, ++count));
        root.setRight(createBinaryTree(root.getRight(), values, ++count));

        return root;
    }
}

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNodeMD root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
    }

    public static void main(String[] args) {
        int[] a = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};

        BinaryTreeMD binaryTree = new BinaryTreeMD();
        binaryTree.buildBinaryTree(a);

        MaximumDepthofBinaryTree tree = new MaximumDepthofBinaryTree();
        int height = tree.maxDepth(binaryTree.getRoot());

        System.out.println(height);
    }
}
