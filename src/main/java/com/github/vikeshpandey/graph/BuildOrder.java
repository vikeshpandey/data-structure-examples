package com.github.vikeshpandey.graph;

import java.util.Stack;

import static com.github.vikeshpandey.graph.State.UNVISITED;
import static com.github.vikeshpandey.graph.State.VISITED;

public class BuildOrder {

    private static void topologicalSort(Graph graph) {
        Stack<Node> stack = new Stack<>();


        for (final Node node : graph.getVertices()) {
            node.setState(UNVISITED);
        }

        for (final Node node : graph.getVertices()) {
            if (node.getState() == UNVISITED) {
                topologicalSortUtil(node, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop().getValue());
        }
    }

    private static void topologicalSortUtil(final Node node,
                                            final Stack<Node> stack) {
        node.setState(VISITED);

        for (Node n : node.getAdjacent()) {
            if (n.getState() == UNVISITED) {
                topologicalSortUtil(n, stack);
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        Node node0 = new Node(0, 0);
        Node node1 = new Node(1, 0);
        Node node2 = new Node(2, 1);
        Node node3 = new Node(3, 1);
        Node node4 = new Node(4, 2);
        Node node5 = new Node(5, 2);


        node5.addAdjacent(node2);
        node5.addAdjacent(node0);

        node4.addAdjacent(node0);
        node4.addAdjacent(node1);

        node2.addAdjacent(node3);
        node3.addAdjacent(node1);

        // add all the vertices into graph
        g.addNode(node0);
        g.addNode(node1);
        g.addNode(node2);
        g.addNode(node3);
        g.addNode(node4);
        g.addNode(node5);

        topologicalSort(g);
    }
}
