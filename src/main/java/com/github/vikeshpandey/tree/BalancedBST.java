package com.github.vikeshpandey.tree;


/**
 * Program to check in the BST is a balanced BST.
 */
public class BalancedBST {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        if (Math.abs(lHeight - rHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static void main(String args[])
    {
        BalancedBST balancedBST = new BalancedBST();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);

        if(balancedBST.isBalanced(root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
