package com.github.vikeshpandey.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Program demonstrates a SetOfStacks behaving like a normal stack
 */
public class SetOfStacks<T> {
    private LinkedList<Stack<T>> parentStack;
    private int childStackSize;

    public SetOfStacks(final LinkedList<Stack<T>> parentStack, final int childStackSize) {
        this.parentStack = parentStack;
        this.childStackSize = childStackSize;
    }

    public void push(T data) {
        Stack<T> tempStack;

        if (!parentStack.isEmpty()) {
            tempStack = parentStack.getLast();

            if (tempStack.size() < childStackSize) {
                tempStack.push(data);
            } else {
                tempStack = new Stack<>();
                tempStack.push(data);
                parentStack.addLast(tempStack);
            }
        } else {
            tempStack = new Stack<>();
            tempStack.push(data);
            parentStack.addLast(tempStack);
        }
    }

    public T pop() {
        if (parentStack.isEmpty()) {
            throw new EmptyStackException();
        }
        Stack<T> tempStack = parentStack.getLast();
        T itemToPop = tempStack.pop();
        if (tempStack.size() == 0) {
            parentStack.removeLast();
        }
        return itemToPop;
    }

    public int size() {
        return parentStack.size();
    }

    public static void main(String[] args) {
        LinkedList<Stack<Integer>> parentList = new LinkedList<>();
        SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(parentList, 2);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        System.out.println("current size of setofstacks should be 3, size is: " + setOfStacks.size());
        setOfStacks.pop();
        System.out.println("size after popping an element should be 2, size is: " + setOfStacks.size());

    }
}

