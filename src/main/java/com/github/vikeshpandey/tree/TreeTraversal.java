package com.github.vikeshpandey.tree;

import static com.github.vikeshpandey.tree.TreeNode.createBinaryTree;

/**
 * Program to show the traversal of tree
 */
public class TreeTraversal {

    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.println(node.value);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.value);
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.value);
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
