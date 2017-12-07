package com.example.stack;

import java.util.Stack;

/**
 * Program to implement a queue using two stacks
 */
public class QueueUsingTwoStacks {

    private Stack<Integer> normal = new Stack<>();
    private Stack<Integer> reverse = new Stack<>();

    public void add(Integer data) {
        normal.push(data);
    }

    public Integer remove(){
        reverse.clear();

        while(!normal.isEmpty()){
            reverse.push(normal.pop());
        }

        Integer item = reverse.pop();

        while(!reverse.isEmpty()){
            normal.push(reverse.pop());
        }
        return item;
    }

    public String toString(){
        StringBuilder returnValue = new StringBuilder();
        normal.forEach(integer -> returnValue.append(integer+ " "));
        return returnValue.toString();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("MyQueue is : "+queue);
        queue.remove();
        System.out.println("now MyQueue is : "+queue);
        queue.add(1);
        queue.add(5);
        System.out.println("now MyQueue is : "+queue);
        queue.remove();
        System.out.println("now MyQueue is : "+queue);

    }
}
