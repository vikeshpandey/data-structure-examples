package com.github.vikeshpandey.linkedlist;

import static java.util.Objects.requireNonNull;

/**
 * this program demonstrates the way to print the kth element from last in a linked list
 * list
 *
 * @author vikesh
 */
public class KthElementFromLast {

    private static Node findKthElement(final Node head, final int pos) {
        Node slowRunner = head;
        Node fastRunner = head;

        for (int i = 0; i < pos; i++) {
            if (fastRunner == null) {
                return null;
            }
            fastRunner = fastRunner.next;
        }
        while (fastRunner != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next;
        }
        return slowRunner;
    }

    private static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.value);
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node nineth = new Node(9);
        // connect the nodes
        first.setNext(second);
        second.setNext(third);
        third.setNext(forth);
        forth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(nineth);

        System.out.println("the list is: ");
        printList(first);
        System.out.println("when k is 3, kth element from last is:" + requireNonNull(findKthElement(first, 3)).value);
        System.out.println("when k is 4, kth element from last is:" + requireNonNull(findKthElement(first, 4)).value);
    }

}
