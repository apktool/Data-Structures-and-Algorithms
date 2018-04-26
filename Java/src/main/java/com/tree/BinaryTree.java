package com.tree;

import lombok.Getter;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author apktool
 * @date 2018-04-26 08:31
 * *
 * Basic binary tree and basic operation
 */
@Getter
public class BinaryTree {
    transient TreeNode root;

    private int count;

    public void buildBinaryTree(int[] values) {
        root = createBinaryTree(root, values, 0);
    }

    public TreeNode createBinaryTree(TreeNode root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNode(values[i]);
        root.setLchild(createBinaryTree(root.getLchild(), values, ++count));
        root.setRchild(createBinaryTree(root.getRchild(), values, ++count));

        return root;
    }

    // --------------------------------------

    public void preOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.printf("%d ", root.getVal());
        preOrderTraverse(root.getLchild());
        preOrderTraverse(root.getRchild());
    }

    public void inOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraverse(root.getLchild());
        System.out.printf("%d ", root.getVal());
        inOrderTraverse(root.getRchild());
    }

    public void postOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrderTraverse(root.getLchild());
        postOrderTraverse(root.getRchild());
        System.out.printf("%d ", root.getVal());
    }

    // --------------------------------------

    public void preOrderNonTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        stack.push(p);

        while (!stack.isEmpty()) {
            p = stack.pop();
            System.out.printf("%d ", p.getVal());
            if (p.getRchild() != null) {
                stack.push(p.getRchild());
            }

            if (p.getLchild() != null) {
                stack.push(p.getLchild());
            }
        }
    }

    public void inOrderNonTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.getLchild();
            } else {
                p = stack.pop();
                System.out.printf("%d ", p.getVal());
                p = p.getRchild();
            }
        }
    }

    public void postOrderNonTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode p = root;
        TreeNode r = null;

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.getLchild();
            } else {
                p = stack.peek();
                if (p.getRchild() != null && p.getRchild() != r) {
                    p = p.getRchild();
                    stack.push(p);
                    p = p.getLchild();
                } else {
                    p = stack.pop();
                    System.out.printf("%d ", p.getVal());
                    r = p;
                    p = null;
                }
            }
        }
    }

    public void levelOrderNonTraverse(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();

        TreeNode p = root;
        queue.add(p);

        while (!queue.isEmpty()) {
            p = queue.poll();
            System.out.printf("%d ", p.getVal());
            if (p.getLchild() != null) {
                queue.add(root.getLchild());
            }

            if (p.getRchild() != null) {
                queue.add(root.getRchild());
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -1, -1, 3, -1, -1};

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.buildBinaryTree(a);

        binaryTree.preOrderTraverse(binaryTree.getRoot());
        System.out.println();

        binaryTree.inOrderTraverse(binaryTree.getRoot());
        System.out.println();

        binaryTree.postOrderTraverse(binaryTree.getRoot());
        System.out.println("\n------");

        binaryTree.preOrderNonTraverse(binaryTree.getRoot());
        System.out.println();

        binaryTree.inOrderNonTraverse(binaryTree.getRoot());
        System.out.println();

        binaryTree.postOrderNonTraverse(binaryTree.getRoot());
        System.out.println();

        binaryTree.levelOrderNonTraverse(binaryTree.getRoot());
        System.out.println();
    }
}
