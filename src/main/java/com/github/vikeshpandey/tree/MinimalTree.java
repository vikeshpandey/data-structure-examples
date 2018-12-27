package com.github.vikeshpandey.tree;

public class MinimalTree {
    private static TreeNode minimalBST(int arr[]) {
        return minimalBST(arr, 0, arr.length - 1);
    }

    private static TreeNode minimalBST(int arr[], int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = minimalBST(arr, start, mid-1);
        root.right = minimalBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = minimalBST(arr);
        TreeNode.printTree(root);
    }
}
