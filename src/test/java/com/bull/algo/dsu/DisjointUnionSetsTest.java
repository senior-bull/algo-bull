package com.bull.algo.dsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisjointUnionSetsTest {

    @Test
    public void test() {
        DisjointUnionSets<String> dsu = new DisjointUnionSets<>();

        dsu.add("X");
        dsu.add("Y");
        dsu.add("Z");

        assertSame("X", dsu.find("X"));
        assertSame("Y", dsu.find("Y"));
        assertSame("Z", dsu.find("Z"));

        assertEquals(3, dsu.getSets().size());

        dsu.union("Y", "Z");

        assertSame("X", dsu.find("X"));
        assertSame(dsu.find("Z"), dsu.find("Y"));

        assertEquals(2, dsu.getSets().size());

        dsu.add("A");

        assertSame("A", dsu.find("A"));

        assertEquals(3, dsu.getSets().size());

        dsu.union("A", "Y");

        assertSame(dsu.find("Z"), dsu.find("Y"));
        assertSame(dsu.find("A"), dsu.find("Z"));

        assertEquals(2, dsu.getSets().size());
    }
}