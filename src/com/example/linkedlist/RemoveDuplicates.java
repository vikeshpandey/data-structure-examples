package com.example.linkedlist;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * this program demonstrates the way to remove duplicates from singly linked
 * list
 * 
 * @author vikesh
 *
 */
public class RemoveDuplicates {

	public void removeDuplicates(Node head) {
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		Node previous = null;
		Node current = head;
		while(current!=null){
			if (ht.containsKey(current.value)) {
				previous.next = current.next;
			} else {
				ht.put(current.value, 1);
				previous = current;
			}
			current = current.next;
		}
	}

	public void printList(Node head) {
		Node n = head;
		while (n !=null) {
			System.out.println(" item is: " + n.value);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		
		RemoveDuplicates rd = new RemoveDuplicates();
	
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(2);
		Node fifth = new Node(4);
		Node sixth = new Node(1);
		
		//connect the nodes
		first.setNext(second);
		second.setNext(third);
		third.setNext(forth);
		forth.setNext(fifth);
		fifth.setNext(sixth);

		LinkedList<Node> list = new LinkedList<>();
		list.addFirst(first);
		list.add(second);
		list.add(third);
		list.add(forth);
		list.add(fifth);
		list.addLast(sixth);

		System.out.println("the list is : ");
		rd.printList(list.getFirst());
		
		System.out.println("list after removing duplicates is: ");
		rd.removeDuplicates(list.getFirst());
		rd.printList(list.getFirst());
	}

}
