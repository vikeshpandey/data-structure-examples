package com.github.vikeshpandey.tree;

import java.util.Random;

public class RandomNode {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        int size;

        public TreeNode(final int data) {
            this.data = data;
            this.size = 1;
        }

        public TreeNode getRandomNode() {
            int leftSize;
            if (left == null) {
                leftSize = 0;
            } else {
                leftSize = left.size;
            }
            Random random = new Random();
            int index = random.nextInt(size);
            if (index < leftSize) {
                return left.getRandomNode();
            } else if (index == leftSize) {
                return this;
            } else {
                return right.getRandomNode();
            }
        }

        public void insert(int data) {
            if (data < this.data) {
                if (left == null) {
                    left = new TreeNode(data);
                } else {
                    left.insert(data);
                }
            } else if (data > this.data) {
                if (right == null) {
                    right = new TreeNode(data);
                } else {
                    right.insert(data);
                }
            }
            size++;
        }

        public TreeNode find(int data) {
            if (data < this.data) {
                if (left == null) {
                    return null;
                }else{
                    return left.find(data);
                }
            }else if (data > this.data) {
                if (right == null) {
                    return null;
                }else{
                    return right.find(data);
                }
            }else{
                return this;
            }
        }
    }
}
