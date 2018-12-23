package com.github.vikeshpandey.linkedlist;

import java.util.LinkedList;

/**
 * This program demonstrates how to sum digits of an element when they are stored in reverse order
 * ex: Input: (7->1->6) + (5->9->2) .That is,617 + 295.
 * Output: 2->1->9. That is, 912.
 */
public class SumOfDigitsPutInReverseNumberOrder {

    private static LinkedList<Node> getSumOfDigitsOfLinkedList(Node n1, Node n2) {
        LinkedList<Node> newList = new LinkedList<>();
        int sum;
        int carry = 0;
        Node firstListNode = n1;
        Node secondListNode = n2;

        while (firstListNode != null && secondListNode != null) {
            sum = firstListNode.value + secondListNode.value;
            sum = sum + carry;

            if (sum <= 9) {
                addElement(newList, sum);
            } else {
                carry = 1;
                if (firstListNode.next != null) {
                    sum = sum % 10;
                }
                addElement(newList, sum);
            }

            firstListNode = firstListNode.next;
            secondListNode = secondListNode.next;
        }
        return newList;
    }

    private static void addElement(LinkedList<Node> newList, int sum) {
        final Node next = new Node(sum);
        if (newList.isEmpty()) {
            newList.add(next);
        } else {
            newList.getLast().setNext(next);
            newList.add(next);
        }
    }

    public static void main(String[] args) {

        Node first1 = new Node(9);
        Node second1 = new Node(7);
        Node third1 = new Node(8);
        first1.setNext(second1);
        second1.setNext(third1);

        Node first2 = new Node(6);
        Node second2 = new Node(8);
        Node third2 = new Node(5);
        first2.setNext(second2);
        second2.setNext(third2);


        Node result = getSumRecursively(first1, first2, 0);
        printList(result);

    }

    private static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }

    private static Node getSumRecursively(Node head1, Node head2, int carry) {
        if (head1 == null && head2 == null && carry == 0) {
            return null;
        }
        int sum = 0;
        if (head1 != null) {
            sum = sum + head1.value;
        }
        if (head2 != null) {
            sum = sum + head2.value;
        }

        sum = sum + carry;
        if (sum > 10) {
            sum = sum % 10;
            carry = 1;
        }
        Node result = new Node(sum);
        if (head1 != null || head2 != null) {
            head1 = head1 == null ? null : head1.next;
            head2 = head2 == null ? null : head2.next;
            Node next = getSumRecursively(head1, head2, carry);
            result.setNext(next);
        }
        return result;
    }
}
