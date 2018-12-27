package com.github.vikeshpandey.graph;


import java.util.LinkedList;

import static com.github.vikeshpandey.graph.State.*;

class BFS {
    private static void search(Graph graph, Node head) {
        if (head == null) {
            return;
        }
        for (Node vertex : graph.getVertices()) {
            vertex.setState(UNVISITED);
        }

        final LinkedList<Node> queue = new LinkedList<>();
        head.setState(VISITING);
        queue.addLast(head);

        while (!queue.isEmpty()) {
            Node node = queue.removeFirst();
            System.out.println(node.getValue());
            for (Node neighbour : node.getAdjacent()) {
                if (neighbour.getState() == UNVISITED) {
                    neighbour.setState(VISITING);
                    queue.addLast(neighbour);
                }
            }
            node.setState(VISITED);
        }
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
                                   "(starting from node vertex)");
        search(g, node0);
    }

}
