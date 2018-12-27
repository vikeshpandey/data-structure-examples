package com.github.vikeshpandey.stack;

class MyStack<Integer> {
    private StackNode<Integer> top;

    private static class StackNode<Integer> {
        private int data;
        private StackNode<Integer> next;

        public StackNode(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        StackNode<Integer> item = new StackNode<>(data);
        if (top == null) {
            top = item;
        } else {
            item.next = top;
            top = item;
            if (top.data > top.next.data) {
                StackNode<Integer> nextToTop = top.next;

                top.data = nextToTop.data + top.data;
                nextToTop.data = top.data - nextToTop.data;
                top.data = top.data - nextToTop.data;
            }

        }
    }

    public int pop() {
        if (top == null) {
            //throw exception
        }
        StackNode<Integer> item = top;
        top = top.next;
        return item.data;
    }

    public int min() {
        if (top == null) {
            throw new RuntimeException();
        }
        return top.data;
    }

}
