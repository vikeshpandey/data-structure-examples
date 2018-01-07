package com.example.tree;

import static com.example.tree.TreeNode.createBinaryTree;

/**
 * Program to show the traversal of tree
 */
public class TreeTraversal {

    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.getValue());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.println(node.getValue());
            inOrderTraversal(node.getRight());
        }
    }

    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.println(node.getValue());
        }
    }

    public static void main(String[] args) {
        TreeTraversal tt = new TreeTraversal();
        // Creating a binary tree
        TreeNode rootNode = createBinaryTree();
        System.out.println("in-order traversal:");
        tt.inOrderTraversal(rootNode);
        System.out.println("==================");
        System.out.println("pre-order traversal:");
        tt.preOrderTraversal(rootNode);
        System.out.println("==================");
        System.out.println("post-order traversal:");
        tt.postOrderTraversal(rootNode);
    }
}
