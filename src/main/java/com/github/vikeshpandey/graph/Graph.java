package com.github.vikeshpandey.graph;

import java.util.LinkedList;

class Graph {
    int numberOfVertices;
    LinkedList<Integer> adjacencyList[];

    Graph(final int numberOfVertices){
        this.numberOfVertices = numberOfVertices;
        adjacencyList = new LinkedList[numberOfVertices];
        for(int i = 0; i<numberOfVertices; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int node, int vertex){
        adjacencyList[node].add(vertex);
    }

}
