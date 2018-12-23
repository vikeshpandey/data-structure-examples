package com.github.vikeshpandey.linkedlist;

/**
 * program to reverse linked list.
 */
public class ReverseElements {

    private static Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    public static void main(String[] args) {
        Node first = new Node(7);
        Node second = new Node(1);
        Node third = new Node(6);
        first.setNext(second);
        second.setNext(third);

        Node head = reverse(first);
        printList(head);
    }

    private static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }
}
