package com.example.linkedlist;

import java.util.LinkedList;

/**
 * This program demonstrates how to sum digits of an element when they are stored in reverse order
 * ex: Input: (7->1->6) + (5->9->2) .That is,617 + 295.
 * Output: 2->1->9. That is, 912.
 */
public class SumOfDigitsPutInReverseNumberOrder {

    public LinkedList<Node> getSumOfDigitsOfLinkedList(Node n1, Node n2){
        LinkedList<Node> newList = new LinkedList<>();
        int sum;
        int carry = 0;
        Node firstListNode = n1;
        Node secondListNode = n2;

        while(firstListNode != null && secondListNode != null){
            sum = firstListNode.value + secondListNode.value;
            sum = sum+carry;

            if(sum<=9){
                addElement(newList, sum);
            }else{
                carry = 1;
                sum = sum%10;
                addElement(newList, sum);
            }

            firstListNode = firstListNode.next;
            secondListNode = secondListNode.next;
        }
        return newList;
    }

    public void addElement(LinkedList<Node> newList, int sum){
        final Node next = new Node(sum);
        if(newList.isEmpty()){
            newList.add(next);
        }else{
            newList.getLast().setNext(next);
            newList.add(next);
        }
    }
    public static void main(String[] args) {

        SumOfDigitsPutInReverseNumberOrder sodl = new SumOfDigitsPutInReverseNumberOrder();
        Node first1 = new Node(7);
        Node second1 = new Node(1);
        Node third1 = new Node(6);
        first1.setNext(second1);
        second1.setNext(third1);

        Node first2 = new Node(5);
        Node second2 = new Node(9);
        Node third2 = new Node(2);
        first2.setNext(second2);
        second2.setNext(third2);


        LinkedList<Node> result = sodl.getSumOfDigitsOfLinkedList(first1, first2);
        sodl.printList(result.getFirst());

    }

    public void printList(Node head) {
        Node n = head;
        while (n !=null) {
            System.out.println(n.value);
            n = n.next;
        }
    }
}
