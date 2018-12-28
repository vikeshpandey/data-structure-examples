package com.github.vikeshpandey.tree;

public class IsSubTree {

    private static boolean isSubTree(TreeNode t1, TreeNode t2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        convertTraversalToString(t1, sb1);
        convertTraversalToString(t2, sb2);
        return sb1.toString().contains(sb2.toString());
    }

    private static void convertTraversalToString(TreeNode root, StringBuilder sb) {
        if(root == null){
            sb.append("X");
            return;
        }
        sb.append(root.value);
        convertTraversalToString(root.left, sb);
        convertTraversalToString(root.right, sb);
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

        //right subtree
        node60.left = node50;
        node60.right = node70;

//        TreeNode node = new TreeNode(80);
//        TreeNode left = new TreeNode(78);
//        TreeNode right = new TreeNode(81);
//        node.left = left;
//        node.right = right;

        boolean isSubTree = isSubTree(rootNode, node60);
        if(isSubTree){
            System.out.println("is sub tree");
        } else{
            System.out.println("is not a sub tree");
        }

    }

}
