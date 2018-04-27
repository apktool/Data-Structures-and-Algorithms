package leetcode.easy;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author apktool
 * @date 2018-04-27 21:00
 * *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *      3
 *     /\
 *    9 20
 *   /   \
 * 15    7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */

@Data
class TreeNodeLOT {
    @NonNull
    int val;
    TreeNodeLOT lchild;
    TreeNodeLOT rchild;
}

class BinaryTreeLOT {

    @Getter
    transient TreeNodeLOT root;

    private int count = 0;

    public void buildBinaryTree(int[] values) {
        root = createBinaryTree(root, values, 0);
    }

    private TreeNodeLOT createBinaryTree(TreeNodeLOT root, int[] values, int i) {
        if (values[i] == -1) {
            return null;
        }

        root = new TreeNodeLOT(values[i]);
        root.setLchild(createBinaryTree(root.getLchild(), values, ++count));
        root.setRchild(createBinaryTree(root.getRchild(), values, ++count));

        return root;
    }

    public void LevelOrder(TreeNodeLOT root) {
        Queue<TreeNodeLOT> queue = new ArrayDeque<TreeNodeLOT>();

        TreeNodeLOT p = root;
        queue.add(p);

        while (!queue.isEmpty()) {
            p = queue.poll();
            System.out.print(p.getVal());

            if (p.getLchild() != null) {
                queue.add(p.getLchild());
            }

            if (p.getRchild() != null) {
                queue.add(p.getRchild());
            }
        }

        System.out.println();
    }
}

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottomDFS(TreeNodeLOT root) {
        Queue<TreeNodeLOT> queue = new LinkedList<TreeNodeLOT>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();


        if (root == null) {
            return wrapList;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();

            for (int i = 0; i < levelNum; i++) {
                TreeNodeLOT p = queue.poll();

                if (p.getLchild() != null) {
                    queue.offer(p.getLchild());
                }
                if (p.getRchild() != null) {
                    queue.offer(p.getRchild());
                }
                subList.add(p.getVal());
            }
            wrapList.add(0, subList);
        }

        return wrapList;
    }

    public List<List<Integer>> levelOrderBottomBFS(TreeNodeLOT root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    public void levelMaker(List<List<Integer>> list, TreeNodeLOT root, int level) {
        if (root == null) {
            return;
        }
        if (level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        levelMaker(list, root.getLchild(), level + 1);
        levelMaker(list, root.getRchild(), level + 1);
        list.get(list.size() - level - 1).add(root.getVal());
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};

        BinaryTreeLOT binaryTreeLOT = new BinaryTreeLOT();
        binaryTreeLOT.buildBinaryTree(a);

        BinaryTreeLevelOrderTraversalII haha = new BinaryTreeLevelOrderTraversalII();

        binaryTreeLOT.LevelOrder(binaryTreeLOT.getRoot());
        List<List<Integer>> linkedList = null;

        linkedList = haha.levelOrderBottomDFS(binaryTreeLOT.getRoot());
        System.out.println(linkedList);

        linkedList = haha.levelOrderBottomBFS(binaryTreeLOT.getRoot());
        System.out.println(linkedList);
    }
}
