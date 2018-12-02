package com.github.vikeshpandey.tree;

/**
 * Program to check if the given tree is BST.
 */
public class IsBST {

    boolean isBST(TreeNode root) {
        if (!isSubTreeBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return false;
        }
        return true;
    }

    boolean isSubTreeBST(TreeNode node, int min, int max) {
        if (node == null) {
            return false;
        }

        if (node.value < min || node.value > max) {
            return false;
        }

        return isSubTreeBST(node.left, min, node.value - 1)
                && isSubTreeBST(node.right, node.value + 1, max);
    }

    public static void main(String args[]) {
        IsBST isBST = new IsBST();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        if (isBST.isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
