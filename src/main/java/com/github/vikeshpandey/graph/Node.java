package com.github.vikeshpandey.graph;

class Node {
    private int value;
    private int index;
    private State state;
    private Node[] adjacent;

    public Node(final int value, int adjacentLength) {
        this.value = value;
        this.adjacent = new Node[adjacentLength];
        this.index = 0;
    }

    public void addAdjacent(Node node) {
        if (index < adjacent.length) {
            adjacent[index] = node;
            index++;
        } else {
            throw new RuntimeException("Node does not have capacity to addAdjacent more neighbours");
        }
    }


    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }
}
