package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author li.wengang
 * @date 2018-11-11 15:15
 * *
 * Given a binary tree
 *
 * struct TreeLinkNode {
 *   TreeLinkNode *left;
 *   TreeLinkNode *right;
 *   TreeLinkNode *next;
 * }
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * Note:
 *
 * You may only use constant extra space.
 * Recursive approach is fine, implicit stack space does not count as extra space for this problem.
 * Example:
 *
 * Given the following binary tree,
 *
 *      1
 *    /  \
 *   2    3
 *  / \    \
 * 4   5    7
 * After calling your function, the tree should look like:
 *
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \    \
 * 4-> 5 -> 7 -> NULL
 */
public class PopulatingNextRightPointersInEachNodeII {
    @Setter
    @Getter
    @RequiredArgsConstructor
    private class TreeLinkNode {
        @NonNull
        private int val;
        private TreeLinkNode left, right, next;
    }

    @Getter
    private TreeLinkNode root;

    private int count;

    public void createBinaryTree(int[] values) {
        root = buildBinaryTree(values, 0);
    }

    private TreeLinkNode buildBinaryTree(int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        TreeLinkNode root = new TreeLinkNode(values[i]);
        root.setLeft(buildBinaryTree(values, ++count));
        root.setRight(buildBinaryTree(values, ++count));

        return root;
    }

    public void connect(TreeLinkNode root) {
        TreeLinkNode tempChild = new TreeLinkNode(0);
        TreeLinkNode pre = tempChild;

        while (root != null) {
            if (root.getLeft() != null) {
                pre.setNext(root.getLeft());
                pre = pre.getNext();
            }

            if (root.getRight() != null) {
                pre.setNext(root.getRight());
                pre = pre.getNext();
            }

            root = root.getNext();

            if (root == null) {
                root = tempChild.getNext();

                pre = tempChild;
                pre.setNext(null);
            }
        }
    }


    public static void main(String[] args) {
        int[] values = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};

        PopulatingNextRightPointersInEachNodeII pp = new PopulatingNextRightPointersInEachNodeII();
        pp.createBinaryTree(values);
        pp.connect(pp.getRoot());
    }
}
