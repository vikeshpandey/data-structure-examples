package com.github.vikeshpandey.linkedlist;

import java.util.LinkedList;

/**
 * program to reverse linked list.
 */
public class ReverseElements {

    public Node reverse(Node head){
        Node curr = head;
        Node next;
        Node prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Node first = new Node(7);
        Node second = new Node(1);
        Node third = new Node(6);
        first.setNext(second);
        second.setNext(third);

        LinkedList<Node> list = new LinkedList<>();
        list.add(first);
        list.add(second);
        list.add(third);

        ReverseElements re = new ReverseElements();
        Node head = re.reverse(list.getFirst());
        re.printList(head);
    }

    public void printList(Node head) {
        Node n = head;
        while (n !=null) {
            System.out.println(n.value);
            n = n.next;
        }
    }
}
