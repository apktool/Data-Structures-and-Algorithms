package leetcode.medium;

import lombok.*;

/**
 * @author li.wengang
 * @date 2018-11-11 00:35
 * *
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 * Example 2:
 *
 * Input: [4,9,0,5,1]
 *     4
 *    / \
 *   9   0
 *  / \
 * 5   1
 * Output: 1026
 * Explanation:
 * The root-to-leaf path 4->9->5 represents the number 495.
 * The root-to-leaf path 4->9->1 represents the number 491.
 * The root-to-leaf path 4->0 represents the number 40.
 * Therefore, sum = 495 + 491 + 40 = 1026.
 */
public class SumRootToLeafNumbers {

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

    public TreeNode createBinaryTree(int[] values) {
        root = buildBinaryTree(values, 0);
        return root;
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

    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }

    private int sumNumbersHelper(TreeNode root, int nums) {
        if(root == null) {
            return 0;
        }

        nums = nums * 10 + root.getVal();

        if(root.getLeft() == null && root.getRight() == null) {
            return nums;
        }

        return sumNumbersHelper(root.getLeft(), nums) + sumNumbersHelper(root.getRight(), nums);
    }

    public static void main(String[] args) {
        int[] values = {4, 9, 5, -1, -1, 1, -1, -1, 0, -1, -1};

        SumRootToLeafNumbers sm = new SumRootToLeafNumbers();
        sm.createBinaryTree(values);

        int result = sm.sumNumbers(sm.getRoot());
        System.out.println(result);
    }
}
