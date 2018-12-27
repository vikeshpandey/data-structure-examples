package com.github.vikeshpandey.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * program to print list of each level nodes of BST
 */
public class ListOfAllLevelNodes {

    private static List<LinkedList<TreeNode>> getList(TreeNode root) {

        List<LinkedList<TreeNode>> list = new ArrayList<>();
        LinkedList<TreeNode> current = new LinkedList<>();
        if (root != null) {
            current.add(root);
        }

        while (!current.isEmpty()) {
            list.add(current);

            LinkedList<TreeNode> parent = current;
            current = new LinkedList<>();

            for (TreeNode node : parent) {
                if (node.left != null) {
                    current.add(node.left);
                }
                if (node.right != null) {
                    current.add(node.right);
                }
            }
        }
        return list;
    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        List<LinkedList<TreeNode>> list = getList(root);
        list.forEach(item -> item.forEach(treeNode -> System.out.println(treeNode.value)));
    }
}
