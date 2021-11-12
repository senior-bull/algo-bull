package com.bull.algo.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vertex<T> implements Iterable<Edge<T>> {

    private final T data;
    private final List<Edge<T>> edges = new ArrayList<>();

    public Vertex(T data) {
        this.data = data;
    }

    public void add(Edge<T> edge) {
        this.edges.add(edge);
    }

    @Override
    public Iterator<Edge<T>> iterator() {
        return edges.iterator();
    }

    @Override
    public boolean equals(Object other) {
        return this == other;
    }
}
