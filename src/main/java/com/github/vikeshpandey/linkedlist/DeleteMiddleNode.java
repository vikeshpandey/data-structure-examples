package com.github.vikeshpandey.linkedlist;

import java.util.LinkedList;

public class DeleteMiddleNode {

    /**
     * use this method to delete any given node from the list but the first or last
     *
     * @param list
     * @param n
     */
    private static void deleteNode(LinkedList<Node> list, Node n) {
        if (n.value == list.getFirst().value || n.value == list.getLast().value) {
            System.out.println("cannot remove the first/last element");
        }

        n.next = n.next.next;
    }

    /**
     * use this method to remove the middle element from the LL
     *
     * @param head
     */
    private static void deleteMiddleNode(Node head) {
        Node fast = head.next;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }

    private static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(" " + n.value);
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

        /**
         * enable this code if you want to test deleting any node from LL
         * If you enable this, the list will be modified
         * and the deletemiddlenode operation will be performed on the modified list.
         * to avoid any such confusion, you can comment any of the methods and test only functionality
         * at a time not to get confused with the output :)
         */
//		dmn.deleteNode(list, second);
//		System.out.println("the list after removing the 3rd node is: ");
//		dmn.printList(list.getFirst());

        deleteMiddleNode(first);
        System.out.println("the list after removing the middle node is: ");
        printList(first);
    }

}
