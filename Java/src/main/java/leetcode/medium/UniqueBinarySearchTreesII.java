package leetcode.medium;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author apktool
 * @date 2018-05-20 21:41
 * *
 * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.
 * Example:
 *
 * Input: 3
 * Output:
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * Explanation:
 * The above output corresponds to the 5 unique BST's shown below:
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 */

public class UniqueBinarySearchTreesII {
    @Data
    private class TreeNodeUBST {
        @NonNull
        int val;
        TreeNodeUBST left;
        TreeNodeUBST right;
    }

    public void levelOrder(TreeNodeUBST root) {
        Queue<TreeNodeUBST> queue = new ArrayDeque<TreeNodeUBST>();

        TreeNodeUBST p = root;
        queue.add(p);

        while (!queue.isEmpty()) {
            p = queue.poll();
            System.out.print(p.getVal());

            if (p.getLeft() != null) {
                queue.add(p.getLeft());
            }

            if (p.getRight() != null) {
                queue.add(p.getRight());
            }
        }
        System.out.println();
    }

    public List<TreeNodeUBST> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNodeUBST>();
        }

        return genTrees(1, n);
    }

    public List<TreeNodeUBST> genTrees(int start, int end) {

        List<TreeNodeUBST> list = new ArrayList<TreeNodeUBST>();

        if (start > end) {
            list.add(null);
            return list;
        }

        if (start == end) {
            list.add(new TreeNodeUBST(start));
            return list;
        }

        List<TreeNodeUBST> left, right;
        for (int i = start; i <= end; i++) {

            left = genTrees(start, i - 1);
            right = genTrees(i + 1, end);

            for (TreeNodeUBST lnode : left) {
                for (TreeNodeUBST rnode : right) {
                    TreeNodeUBST root = new TreeNodeUBST(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }

        return list;
    }


    public static void main(String[] args) {
        int n = 3;

        UniqueBinarySearchTreesII haha = new UniqueBinarySearchTreesII();
        List<TreeNodeUBST> list = haha.generateTrees(n);

        for (TreeNodeUBST item : list) {
            haha.levelOrder(item);
        }
    }
}