package com.github.vikeshpandey.graph;

class Graph {
    private int index;
    private Node[] vertices;

    Graph(final int capacity) {
        this.vertices = new Node[capacity];
        this.index = 0;
    }

    void addNode(Node node) {
        if (index < vertices.length) {
            vertices[index] = node;
            index++;
        } else {
            throw new RuntimeException("Graph is at full capacity");
        }
    }

    public int getIndex() {
        return index;
    }

    public int getTotalNumberOfVertices() {
        return index;
    }

    public Node[] getVertices() {
        return vertices;
    }
}
