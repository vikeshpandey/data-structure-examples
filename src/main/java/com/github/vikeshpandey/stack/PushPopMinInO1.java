package com.github.vikeshpandey.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * This program implements a stack which performs push pop in O(1).
 * This also has an additional method min() which gives the minimum element
 * in the stack, this also works in O(1)
 */
public class PushPopMinInO1 {
    static Stack<Integer> auxStack = new Stack<>();
    static Stack<Integer> mainStack = new Stack<>();

    public static void push(Integer data) {
        if (!auxStack.isEmpty()) {
            if (data < auxStack.peek()) {
                auxStack.push(data);
            }
        } else {
            auxStack.push(data);
        }
        mainStack.push(data);
    }

    public static Integer pop() {
        if (mainStack.isEmpty()) {
            throw new EmptyStackException();
        }
        if (mainStack.peek() == auxStack.peek()) {
            auxStack.pop();
        }
        return mainStack.pop();
    }

    public static Integer min() {
        return auxStack.peek();
    }

    public static void main(String[] arg) {
        push(18);
        push(19);
        push(29);
        push(15);
        push(16);
        System.out.println("minimum element in the stack is : " + min());
        pop();
        pop();
        System.out.println("minimum element in the stack is, after popping two elements : " + min());
    }


}
