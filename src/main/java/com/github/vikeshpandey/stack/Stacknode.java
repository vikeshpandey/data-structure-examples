package com.github.vikeshpandey.stack;

/**
 * This represents a node in stack
 */
public class Stacknode<T> {
    public int data;
    public Stacknode<T> next;

    public Stacknode(final int data) {
        this.data = data;
    }
}
