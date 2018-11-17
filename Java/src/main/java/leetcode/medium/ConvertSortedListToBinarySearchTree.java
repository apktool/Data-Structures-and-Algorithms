package leetcode.medium;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author li.wengang
 * @date 2018-11-17 21:39
 * *
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted linked list: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class ConvertSortedListToBinarySearchTree {
    @Getter
    @Setter
    @RequiredArgsConstructor
    private class ListNode {
        @NonNull
        private int val;
        private ListNode next;
    }

    @Getter
    @Setter
    @RequiredArgsConstructor
    private class TreeNode {
        @NonNull
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    @Getter
    private ListNode head;

    public void createLinkList(int[] values) {
        ListNode head = new ListNode(-1);
        ListNode pre = head;

        for (int i = 0; i < values.length; i++) {
            ListNode p = new ListNode(values[i]);
            pre.setNext(p);
            pre = p;
        }

        pre.setNext(null);
        this.head = head.getNext();
    }

    public int getLinkListLength(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.getNext();
            count++;
        }

        return count;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        return sortedListToBSTHelper(head, 0, getLinkListLength(head) - 1);
    }

    private TreeNode sortedListToBSTHelper(ListNode head, int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(head.getVal());
        }

        int mid = start + (end - start) / 2;

        ListNode p = head;
        for (int i = start; i < mid; i++) {
            p = p.getNext();
        }

        TreeNode root = new TreeNode(p.getVal());
        root.setLeft(sortedListToBSTHelper(head, start, mid - 1));
        root.setRight(sortedListToBSTHelper(p.getNext(), mid + 1, end));

        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getVal() + " ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public static void main(String[] args) {
        int[] values = {-10, -3, 0, 5, 9};

        ConvertSortedListToBinarySearchTree csbst = new ConvertSortedListToBinarySearchTree();
        csbst.createLinkList(values);
        csbst.getLinkListLength(csbst.getHead());

        TreeNode root = csbst.sortedListToBST(csbst.getHead());
        csbst.preorder(root);
    }
}
