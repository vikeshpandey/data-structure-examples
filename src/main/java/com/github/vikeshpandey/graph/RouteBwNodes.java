package com.github.vikeshpandey.graph;

import java.util.LinkedList;

/**
 * Program to find the route between two nodes in a graph
 */
public class RouteBwNodes {
    boolean isRoutePresent(Integer source, Integer destination, Graph graph) {
        final boolean[] found = {false};
        if (source == null || destination == null) {
            return found[0];
        }
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.numberOfVertices];
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            Integer element = queue.poll();
            visited[element] = true;

            graph.adjacencyList[element].forEach(integer -> {
                if (integer.equals(destination)) {
                    System.out.println("Element found: " + integer);
                    found[0] = true;
                }
                if (!visited[integer]) {
                    visited[integer] = true;
                    queue.add(integer);
                }
            });
        }
        return found[0];
    }

    public static void main(String[] arg) {
        RouteBwNodes routeBwNodes = new RouteBwNodes();
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        int u = 1;
        int v = 3;
        if (routeBwNodes.isRoutePresent(u, v, g))
            System.out.println("There is a path from " + u + " to " + v);
        else
            System.out.println("There is no path from " + u + " to " + v);
        ;

        u = 3;
        v = 1;
        if (routeBwNodes.isRoutePresent(u, v, g))
            System.out.println("There is a path from " + u + " to " + v);
        else
            System.out.println("There is no path from " + u + " to " + v);
        ;
    }
}

