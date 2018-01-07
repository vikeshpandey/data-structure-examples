package com.example.tree;


import java.util.LinkedList;

class BFS {

    void printBFS(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.getValue());
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTree();
        BFS bfs = new BFS();
        bfs.printBFS(root);
    }
}
