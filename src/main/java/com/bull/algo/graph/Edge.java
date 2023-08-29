package com.bull.algo.graph;

public class Edge<T> {

    private final Vertex<T> from;
    private final Vertex<T> to;

    public Edge(Vertex<T> from, Vertex<T> to) {
        this.from = from;
        this.to = to;
    }

    public Vertex<T> from() {
        return from;
    }

    public Vertex<T> to() {
        return to;
    }
}
