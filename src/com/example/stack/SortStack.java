package com.example.stack;

import java.util.Stack;

/**
 * program to sort a stack
 */
public class SortStack {
    Stack<Integer> temp = new Stack<>();

    public void sortStack(Stack s) {
        while (!s.isEmpty()) {
            int s1 = (int) s.pop();
            while (!temp.isEmpty() && (temp.peek() > s1)) {
                s.push(temp.pop());
            }
            temp.push(s1);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(18);
        s.push(19);
        s.push(29);
        s.push(15);
        s.push(16);
        System.out.println("stack is : " + s);

        SortStack ss = new SortStack();
        ss.sortStack(s);
        System.out.println("stack is : " + ss.temp);

    }
}
