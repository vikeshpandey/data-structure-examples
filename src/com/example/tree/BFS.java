package com.example.tree;


import java.util.LinkedList;

class BFS {

    void printBFS(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.value);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTree();
        BFS bfs = new BFS();
        bfs.printBFS(root);
    }
}
