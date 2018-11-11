package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author li.wengang
 * @date 2018-11-12 00:03
 * *
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 *
 * Example:
 *
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 *
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 */
public class BinaryTreeRightSideView {
    @Setter
    @Getter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    @Getter
    private TreeNode root;

    private int count;

    public void createBinaryTree(int[] values) {
        this.root = buildBinaryTree(values, count);
    }

    private TreeNode buildBinaryTree(int[] array, int i) {
        if (array[i] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(array[i]);
        root.setLeft(buildBinaryTree(array, ++count));
        root.setRight(buildBinaryTree(array, ++count));

        return root;
    }

    public List<Integer> rightSideView1(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();

            for (int i = 0; i < cnt; i++) {
                TreeNode cur = queue.poll();

                if (i == cnt - 1) {
                    list.add(cur.getVal());
                }

                if (cur.getLeft() != null) {
                    queue.offer(cur.getLeft());
                }

                if (cur.getRight() != null) {
                    queue.offer(cur.getRight());
                }
            }
        }

        return list;
    }

    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightSideViewHelper(root, list, 0);
        return list;
    }

    private void rightSideViewHelper(TreeNode root, List<Integer> list, int currDepth) {
        if (root == null) {
            return;
        }

        if (currDepth == list.size()) {
            list.add(root.getVal());
        }

        rightSideViewHelper(root.getRight(), list, currDepth + 1);
        rightSideViewHelper(root.getLeft(), list, currDepth + 1);
    }

    public static void main(String[] args) {
        int[] values = {1, 2, -1, 5, -1, -1, 3, -1, 4, -1, -1};

        BinaryTreeRightSideView bs = new BinaryTreeRightSideView();
        bs.createBinaryTree(values);

        List<Integer> list;
        list = bs.rightSideView1(bs.getRoot());
        list.forEach(t -> System.out.print(t + " "));

        System.out.println();

        list = bs.rightSideView2(bs.getRoot());
        list.forEach(t -> System.out.print(t + " "));
    }
}
