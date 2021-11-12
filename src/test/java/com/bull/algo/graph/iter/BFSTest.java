package com.bull.algo.graph.iter;

import com.bull.algo.graph.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BFSTest {

    @Test
    public void testSimple() {
        var g = new Graph<String>();
        var a = g.add("A");
        var b = g.add("B");
        g.addEdge(a, b);

        Assertions.assertEquals(List.of(a, b), BFS.iterate(g, a));
    }
}