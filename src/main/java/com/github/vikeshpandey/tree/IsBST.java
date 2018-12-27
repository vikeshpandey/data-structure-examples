package com.github.vikeshpandey.tree;

import java.util.ArrayList;

/**
 * Program to check if the given tree is BST.
 */
public class IsBST {

    private static int index = 0;

    private static void copyBST(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        copyBST(root.left, list);
        list.add(root);
        index++;
        copyBST(root.right, list);
    }
    //simple but takes extra memory for array O(N)
    private static boolean checkBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        copyBST(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).value <= list.get(i - 1).value) {
                return false;
            }
        }
        return true;
    }

    // complex but operates in O(n) using extra space for recursion O(log N)
    private static boolean isBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private static boolean isBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.value <= min) || (max != null && node.value > max)) {
            return false;
        }

        return isBST(node.left, min, node.value) && isBST(node.right, node.value, max);
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(5);
//        5
//        /\
//       3  10
//       /\  /\
//      2 4 9 11
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);

        if (isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
