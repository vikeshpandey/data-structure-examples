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
}
