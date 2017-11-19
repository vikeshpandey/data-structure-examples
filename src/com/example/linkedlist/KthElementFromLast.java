package com.example.linkedlist;

import java.util.LinkedList;

/**
 * this program demonstrates the way to print the kth element from last in a linked list
 * list
 * 
 * @author vikesh
 *
 */
public class KthElementFromLast {

	public Node getKthFromLast(LinkedList<Node> list, int k) {

		if (k == 0) {
			return list.getLast();
		}

		if (k == list.size()) {
			return list.getFirst();
		}

		Node fast = list.getFirst();
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		Node slow = list.getFirst();

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow.next;
	}
	
	public void printList(Node head) {
		Node n = head;
		while (n !=null) {
			System.out.println(n.value);
			n = n.next;
		}
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

		// add elements to list
		LinkedList<Node> list = new LinkedList<>();
		list.addFirst(first);
		list.add(second);
		list.add(third);
		list.add(forth);
		list.add(fifth);
		list.add(sixth);
		list.add(seventh);
		list.add(eighth);
		list.addLast(nineth);

		KthElementFromLast kel = new KthElementFromLast();
		System.out.println("the list is: ");
		kel.printList(list.getFirst());
		System.out.println("when k is 3, kth element from last is:" + kel.getKthFromLast(list, 3).value);
		System.out.println("when k is 4, kth element from last is:" + kel.getKthFromLast(list, 4).value);
	}

}
