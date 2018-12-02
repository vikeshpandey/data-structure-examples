package com.github.vikeshpandey.graph;


class DFS {

    void search(Integer s, Graph g, final boolean[] visited) {
        if (s == null) {
            return;
        }
        System.out.println("Element is : "+s);
        visited[s] = true;

        g.adjacencyList[s].forEach(integer -> {
            if(!visited[integer]){
                visited[integer] = true;
                search(integer, g, visited);
            }
        });
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        dfs.search(2, g, new boolean[g.numberOfVertices]);
    }
}
