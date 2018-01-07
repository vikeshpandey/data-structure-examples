package com.example.tree;

/**
 * Represents a node in a Tree
 */
public class TreeNode {

    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println("Element: " + root.getValue());
        printTree(root.getLeft());
        printTree(root.getRight());
    }

    public static TreeNode createBinaryTree() {

        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.setLeft(node20);
        rootNode.setRight(node60);

        node20.setLeft(node10);
        node20.setRight(node30);

        node60.setLeft(node50);
        node60.setRight(node70);

        return rootNode;
    }
}
