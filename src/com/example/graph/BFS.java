package com.example.graph;


import java.util.LinkedList;

class BFS {

    void search(Integer root, Graph g) {
        if (root == null) {
            return;
        }
        boolean[] visited = new boolean[g.numberOfVertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[root] = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            Integer n = queue.poll();
            System.out.println("element is : " + n);
            visited[n] = true;
            g.adjacencyList[n]
                    .forEach(integer -> {
                        if (!visited[integer]) {
                            visited[integer] = true;
                            queue.add(integer);
                        }
                    });
        }
    }

    public static void main(String args[]) {
        BFS bfs = new BFS();
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        bfs.search(2, g);
    }


}
