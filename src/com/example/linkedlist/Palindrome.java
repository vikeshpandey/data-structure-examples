package com.example.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * This program checks if the given linked list is a palindrome
 */
public class Palindrome {

    public static boolean isPalindrome(Node head) {
        Map<Integer, Integer> map = new HashMap<>();
        Node node = head;
        while (node != null) {
            if (map.containsKey(node.value)) {
                map.put(node.value, map.get(node.value) + 1);
            } else {
                map.put(node.value, 1);
            }
            node = node.next;
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Node first = new Node(7);
        Node second = new Node(1);
        Node third = new Node(6);
        Node forth = new Node(1);
        Node fifth = new Node(7);
        first.setNext(second);
        second.setNext(third);
        third.setNext(forth);
        forth.setNext(fifth);
        LinkedList<Node> list = new LinkedList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(forth);
        list.add(fifth);
        System.out.println("this should be true, actual value is : " + isPalindrome(list.getFirst()));


    }
}
