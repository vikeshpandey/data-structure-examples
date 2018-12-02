package com.github.vikeshpandey.tree;

/**
 * program to create BST out of sorted array
 */
public class SortedArrayToBST {
    private TreeNode convertSortedArrayToBST(int start, int end, Integer[] arr) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = convertSortedArrayToBST(start, mid - 1, arr);
        root.right = convertSortedArrayToBST(mid + 1, end, arr);
        return root;
    }

    public static void main(String[] arg) {
        Integer[] arr = {2, 3, 6, 7, 8, 9, 12, 15, 16, 18, 20};
        SortedArrayToBST s = new SortedArrayToBST();
        TreeNode root = s.convertSortedArrayToBST(0, arr.length - 1, arr);
        TreeNode.printTree(root);
    }
}
