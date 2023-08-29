package com.bull.algo.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph<T> implements Iterable<Vertex<T>> {

    private final List<Vertex<T>> vertices = new ArrayList<>();

    public Vertex<T> add(T value) {
        return new Vertex<>(value);
    }

    public void addEdge(Vertex<T> from, Vertex<T> to) {
        from.add(new Edge<>(from, to));
    }

    @Override
    public Iterator<Vertex<T>> iterator() {
        return vertices.iterator();
    }
}
