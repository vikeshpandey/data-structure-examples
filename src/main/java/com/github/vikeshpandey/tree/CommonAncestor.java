package com.github.vikeshpandey.tree;

public class CommonAncestor {

    /**
     * uncomment it if parent is known. TODO:: add a parent field in TreeNode class
     *
     * @param root
     * @param n1
     * @param n2
     * @return
     */
//    TreeNode commonAncestorWhenParentKnown(TreeNode p, TreeNode q) {
//        int pDepth = depth(p);
//        int qDepth = depth(q);
//
//        int diff;
//        if (pDepth > qDepth) {
//            diff = pDepth - qDepth;
//            p = goUpBy(p, diff);
//        } else {
//            diff = qDepth - pDepth;
//            q = goUpBy(q, diff);
//        }
//
//        while (p != q && p != null && q != null) {
//            p = p.parent;
//            q = q.parent;
//        }
//        return p == null || q == null ? null : p;
//    }
//
//    private static int depth(TreeNode node) {
//        int depth = 0;
//        while (node != null) {
//            node = node.parent;
//            depth++;
//        }
//        return depth;
//    }
//
//    private static TreeNode goUpBy(TreeNode node, int upByCount) {
//        while (upByCount > 0 && node != null) {
//            node = node.parent;
//            upByCount--;
//        }
//        return node;
//    }
    private static TreeNode lowestCommonAncestor(TreeNode root,
                                                 TreeNode n1,
                                                 TreeNode n2) {
        while (root != null) {
            if (root.value > n1.value && root.value > n2.value) {
                root = root.left;
            } else if (root.value < n1.value && root.value < n2.value) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;
        //left subtree
        node20.left = node10;
        node20.right = node30;

        TreeNode node29 = new TreeNode(29);
        TreeNode node31 = new TreeNode(31);
        node30.left = node29;
        node30.right = node31;
        //right subtree
        node60.left = node50;
        node60.right = node70;

        TreeNode treeNode = lowestCommonAncestor(rootNode, node70, node30);
        System.out.println("Lowest common ancestor is : " + treeNode.value);
    }
}
