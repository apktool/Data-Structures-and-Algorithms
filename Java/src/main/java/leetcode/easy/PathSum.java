package leetcode.easy;

import javafx.scene.shape.Path;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author apktool
 * @date 2018-04-29 21:36
 * *
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * Note: A leaf is a node with no children.
 *
 * Example:
 * Given the below binary tree and sum = 22,
 *
 *        5
 *       / \
 *      4   8
 *     /   / \
 *    11  13  4
 *   /  \      \
 *  7    2      1
 *
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
@Data
class TreeNodePS {
    @NonNull
    int val;
    TreeNodePS left;
    TreeNodePS right;
}

class BinaryTreePS {

    @Getter
    transient TreeNodePS root;

    private int count = 0;

    public void buildBinaryTree(int[] values) {
        root = createBinaryTree(root, values, 0);
    }

    private TreeNodePS createBinaryTree(TreeNodePS root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNodePS(values[i]);
        root.setLeft(createBinaryTree(root.getLeft(), values, ++count));
        root.setRight(createBinaryTree(root.getRight(), values, ++count));

        return root;
    }
}

public class PathSum {
    private int count = 0;
    private boolean flag = false;

    public boolean hasPathSum1(TreeNodePS root, int sum) {
        if(root == null) {
            return flag;
        }

        count = count + root.getVal();
        if(count == sum && root.getLeft() == null && root.getRight() == null) {
            flag = true;
        }

        hasPathSum1(root.getLeft(), sum);
        hasPathSum1(root.getRight(), sum);

        count = count - root.getVal();

        return flag;
    }

    public boolean hasPathSum2(TreeNodePS root, int sum) {
        if(root == null) {
            return false;
        }

        if(sum - root.val == 0 && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum2(root.left, sum - root.val) || hasPathSum2(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        int[] values = {5, 4, 11, 7, -1, -1, 2, -1, -1, -1, 8, 13, -1, -1, 4, -1, 1, -1, -1};
        int sum = 22;
        boolean flag;

        BinaryTreePS btps = new BinaryTreePS();
        btps.buildBinaryTree(values);
        TreeNodePS root = btps.getRoot();

        PathSum pathSum = new PathSum();

        flag = pathSum.hasPathSum1(root, sum);
        System.out.println(flag);

        flag = pathSum.hasPathSum2(root, sum);
        System.out.println(flag);
    }
}
