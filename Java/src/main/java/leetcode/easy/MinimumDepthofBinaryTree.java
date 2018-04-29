package leetcode.easy;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author apktool
 * @date 2018-04-29 18:38
 * *
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 *
 * Example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its minimum depth = 2.
 */
@Data
class TreeNodeMDBT {
    @NonNull
    int val;
    TreeNodeMDBT left;
    TreeNodeMDBT right;
}

class BinaryTreeMDBT {

    @Getter
    transient TreeNodeMDBT root;

    private int count = 0;

    public void buildBinaryTree(int[] values) {
        root = createBinaryTree(root, values, 0);
    }

    private TreeNodeMDBT createBinaryTree(TreeNodeMDBT root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNodeMDBT(values[i]);
        root.setLeft(createBinaryTree(root.getLeft(), values, ++count));
        root.setRight(createBinaryTree(root.getRight(), values, ++count));

        return root;
    }
}

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNodeMDBT root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.getLeft());
        int right = minDepth(root.getRight());

        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }

    public static void main(String[] args) {
//        int[] a = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        int[] a = {1, 2, -1, -1, -1};

        BinaryTreeMDBT binaryTreeMDBT = new BinaryTreeMDBT();
        binaryTreeMDBT.buildBinaryTree(a);

        MinimumDepthofBinaryTree haha = new MinimumDepthofBinaryTree();

        int result = haha.minDepth(binaryTreeMDBT.getRoot());
        System.out.println(result);
    }
}
