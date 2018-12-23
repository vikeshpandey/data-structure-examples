package com.github.vikeshpandey.linkedlist;

public class PartitionList {

    private static Node partitionList(Node node, int element) {
        Node head = node;
        Node tail = node;
        while (node != null) {
            Node next = node.next;
            if (node.value < element) {
                //insert element at the beginning
                node.next = head;
                head = node;
            } else {
                //insert element to end
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }

    private static void printList(Node head) {
        Node n = head;
        System.out.println("node----"+n.value);
        while (n != null) {
            System.out.print(n.value);
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(4);
        Node third = new Node(3);
        Node forth = new Node(5);
        Node tail = new Node(2);
        // connect the nodes
        head.setNext(second);
        second.setNext(third);
        third.setNext(forth);
        forth.setNext(tail);

        Node node = partitionList(head, 3);
        printList(node);

    }
}
