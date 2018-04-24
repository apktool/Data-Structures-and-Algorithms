package leetcode.easy;

public class SameTree {
    static int counter = 0;

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        private TreeNode(int val) {
            val = val;
            left = null;
            right = null;
        }
    }

    public TreeNode createTreeNode(TreeNode root, int[] values, int i) {
        if (root == null || i >= values.length) {
            return root;
        }

        TreeNode lchild = new TreeNode(values[i]);
        TreeNode rchild = new TreeNode(values[i]);
        root.val = values[i];

        root.left = createTreeNode(lchild, values, ++counter);
        root.right = createTreeNode(rchild, values, ++counter);

        return root;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }

    public boolean entry(int[] a, int[] b) {
        TreeNode root1 = createTreeNode(new TreeNode(-1), a, 0);
        preOrder(root1);

        System.out.printf("\n", counter = 0);

        TreeNode root2 = createTreeNode(new TreeNode(-1), b, 0);
        preOrder(root2);

        return isSameTree(root1, root2);
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int[] b = {1, 2, 3};

        SameTree sameTree = new SameTree();
        boolean flag = sameTree.entry(a, b);
        System.out.printf("\n%b", flag);
    }
}
