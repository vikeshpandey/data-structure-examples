package com.github.vikeshpandey.graph;

import java.util.LinkedList;

import static com.github.vikeshpandey.graph.State.*;

/**
 * Program to find the route between two nodes in a graph
 */
public class RouteBwNodes {

    private static boolean isRoutePresent(Graph g, Node head, Node tail) {
        if (head == null || tail == null) {
            return false;
        }
        if (head == tail) {
            return true;
        }
        for (Node vertex : g.getVertices()) {
            vertex.setState(UNVISITED);
        }

        final LinkedList<Node> queue = new LinkedList<>();
        head.setState(VISITING);
        queue.addLast(head);

        while (!queue.isEmpty()) {
            Node node = queue.removeFirst();
            if (node != null) {
                for (Node neighbour : node.getAdjacent()) {
                    if (neighbour.getState() == UNVISITED) {
                        if (neighbour == tail) {
                            return true;
                        } else {
                            neighbour.setState(VISITING);
                            queue.addLast(neighbour);
                        }
                    }
                }
                node.setState(VISITED);
            }
        }
        return false;
    }

    public static void main(String[] arg) {
        Graph g = new Graph(6);
        //create vertices
        Node node0 = new Node(0, 3);
        Node node1 = new Node(1, 0);
        Node node2 = new Node(2, 0);
        Node node3 = new Node(3, 1);
        Node node4 = new Node(4, 1);
        Node node5 = new Node(5, 0);

        //create edges by connecting vertices
        node0.addAdjacent(node1);
        node0.addAdjacent(node2);
        node0.addAdjacent(node3);
        node3.addAdjacent(node4);
        node4.addAdjacent(node5);

        // add all the vertices into graph
        g.addNode(node0);
        g.addNode(node1);
        g.addNode(node2);
        g.addNode(node3);
        g.addNode(node4);
        g.addNode(node5);

        System.out.println("Following is Breadth First Traversal " +
                                   "(starting from vertex 2)");

        if (isRoutePresent(g, node0, node5)) {
            System.out.println("There is a path from " + node0.getValue() + " to " + node5.getValue());
        } else {
            System.out.println("There is no path from " + node0.getValue() + " to " + node5.getValue());
        }

        if (isRoutePresent(g, node5, node4)) {
            System.out.println("There is a path from " + node5.getValue() + " to " + node4.getValue());
        } else {
            System.out.println("There is no path from " + node5.getValue() + " to " + node4.getValue());
        }
    }
}

