package com.bull.algo.queue.priority;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexMinPQTest {

    @Test
    public void testSimple() {

        var q = new IndexMinPQ<Integer>(256);
        q.insert(6);
        q.insert(1);
        q.insert(10);
        q.insert(2);
        q.insert(3);

        Assertions.assertEquals(1, q.minKey());

        q.delMin();

        Assertions.assertEquals(2, q.minKey());
    }
}