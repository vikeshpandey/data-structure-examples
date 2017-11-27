package com.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * This program demonstrates the way to detect a loop in a linked list
 */
public class DetectLoop {

	public static Node findLoop(Node head) {
		Set<Node> set = new HashSet<>();
		Node current = head;

		while (current != null) {
			if (set.contains(current)) {
				return current;
			} else {
				set.add(current);
			}
			current = current.next;
		}
		return null;
	}

	public static boolean hasLoop(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null & fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		

		// connect the nodes
		first.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(second);
		// fifth.setNext(sixth);
		System.out.println("the following should return true: actual is: " + hasLoop(first));
		System.out.println("the looped node is: " + findLoop(first).value);
	}

}
