package com.github.vikeshpandey.linkedlist;

public class IntersectingNode {

    private static Node findIntersectingNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node node1 = head1;
        Node node2 = head2;

        int length1 = 1, length2 = 1;

        while (node1.next != null) {
            ++length1;
            node1 = node1.next;

        }

        while (node2.next != null) {
            ++length2;
            node2 = node2.next;
        }

        if (node1.value != node2.value) {
            System.out.println("lists do not have an intersecting node");
        }
        int nodesToLeave = length1 > length2 ? length1 - length2 : length2 - length1;

        node2 = head2;
        node1 = head1;
        for (int i = 0; i < nodesToLeave; i++) {
            node1 = node1.next;
        }
        while (node2 != node1) {
            node2 = node2.next;
            node1 = node1.next;
        }
        return node2;
    }

    public static void main(String[] args) {
        Node first1 = new Node(3);
        Node second1 = new Node(1);
        Node third1 = new Node(5);
        Node forth1 = new Node(9);
        Node common = new Node(7);
        Node sixth1 = new Node(2);
        Node seventh1 = new Node(1);
        first1.setNext(second1);
        second1.setNext(third1);
        third1.setNext(forth1);
        forth1.setNext(common);
        common.setNext(sixth1);
        sixth1.setNext(seventh1);


        Node first2 = new Node(4);
        Node second2 = new Node(6);
        first2.setNext(second2);
        second2.setNext(common);
        common.setNext(sixth1);
        sixth1.setNext(seventh1);

        Node intersectingNode = findIntersectingNode(first1, first2);
        System.out.println(intersectingNode.value);
    }
}
