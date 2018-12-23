package com.github.vikeshpandey.linkedlist;

import java.util.HashSet;

/**
 * this program demonstrates the way to remove duplicates from singly linked
 * list
 *
 * @author vikesh
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(2);
        Node fifth = new Node(4);
        Node sixth = new Node(1);

        //connect the nodes
        first.setNext(second);
        second.setNext(third);
        third.setNext(forth);
        forth.setNext(fifth);
        fifth.setNext(sixth);

        System.out.println("the list is : ");
        printList(first);

        System.out.println("list after removing duplicates using extra space is: ");
        removeDuplicates(first);
        printList(first);
        System.out.println("list after removing duplicates without extra space is: ");
        removeDuplicatesWithoutExtraSpace(first);
        printList(first);
    }

    private static void removeDuplicates(final Node head) {
        final HashSet<Integer> set = new HashSet<>();
        Node temp = head, prev = null;

        while (temp != null) {
            if (set.contains(temp.value)) {
                prev.next = temp.next;

            } else {
                set.add(temp.value);
                prev = temp;
            }
            temp = temp.next;
        }
    }

    private static void removeDuplicatesWithoutExtraSpace(final Node head) {
        Node currentNode = head;
        Node runnerNode;

        while (currentNode != null) {
            runnerNode = currentNode;
            while (runnerNode.next != null) {
                if (currentNode.value == runnerNode.next.value) {
                    runnerNode.next = runnerNode.next.next;
                } else {
                    runnerNode = runnerNode.next;
                }
            }
            currentNode = currentNode.next;
        }
    }

    private static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(" item is: " + n.value);
            n = n.next;
        }
    }
}
