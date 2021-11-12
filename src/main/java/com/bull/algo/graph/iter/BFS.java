package com.bull.algo.graph.iter;

import com.bull.algo.graph.Graph;
import com.bull.algo.graph.Vertex;

import java.util.*;

public class BFS {

    public static <T> List<Vertex<T>> iterate(Graph<T> graph, Vertex<T> root) {

        List<Vertex<T>> result = new ArrayList<>();
        Map<Vertex<T>, Boolean> visited = new HashMap<>();
        Queue<Vertex<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var vertex = queue.poll();
            result.add(vertex);
            visited.put(vertex, true);

            for (var edge : vertex) {

                if (!visited.getOrDefault(edge.to(), false)) {
                    queue.add(edge.to());
                }
            }
        }

        return result;
    }
}
