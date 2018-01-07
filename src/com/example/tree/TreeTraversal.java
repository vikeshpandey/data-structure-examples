package com.example.tree;

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
