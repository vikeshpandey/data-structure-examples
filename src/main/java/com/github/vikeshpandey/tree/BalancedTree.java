package com.github.vikeshpandey.tree;


/**
 * Program to check in the BST is a balanced BST.
 */
public class BalancedTree {

    private static boolean isBalanced(final TreeNode root) {
        if (root == null) {
            return true;
        }
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);

        return diff(lHeight, rHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int getHeight(final TreeNode node) {
        if (node != null) {
            return getHeight(node.left) + getHeight(node.right) + 1;
        } else {
            return 0;
        }
    }

    private static int diff(int lHeight, final int rHeight) {
        return lHeight > rHeight ? lHeight - rHeight : rHeight - lHeight;
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);

        if (isBalanced(root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}