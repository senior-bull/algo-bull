package com.bull.algo.dsu;

import java.util.*;

class DisjointUnionSets<T> {

    private final Map<T, Integer> rank;
    private final Map<T, T> parent;

    public DisjointUnionSets() {
        this.rank = new HashMap<>();
        this.parent = new HashMap<>();
    }

    void add(T item) {
        rank.put(item, 0);
        parent.put(item, item);
    }

    public T find(T item) {
        if (parent.get(item) != item) {
            parent.put(item, find(parent.get(item)));
        }

        return parent.get(item);
    }

    void union(T x, T y) {
        T xRoot = find(x), yRoot = find(y);

        if (xRoot == yRoot)
            return;

        int xRank = rank.get(xRoot);
        int yRank = rank.get(yRoot);

        if (xRank < yRank)
            parent.put(xRoot, yRoot);
        else if (yRank < xRank)
            parent.put(yRoot, xRoot);
        else {
            parent.put(yRoot, xRoot);
            rank.put(xRoot, rank.get(xRoot) + 1);
        }
    }
}

