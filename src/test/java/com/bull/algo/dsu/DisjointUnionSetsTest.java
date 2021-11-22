package com.bull.algo.dsu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisjointUnionSetsTest {

    @Test
    public void test() {
        var dsu = new DisjointUnionSets<String>();

        dsu.add("X");
        dsu.add("Y");
        dsu.add("Z");

        assertSame("X", dsu.find("X"));
        assertSame("Y", dsu.find("Y"));
        assertSame("Z", dsu.find("Z"));

        dsu.union("Y", "Z");

        assertSame("X", dsu.find("X"));
        assertSame(dsu.find("Z"), dsu.find("Y"));

        dsu.add("A");

        assertSame("A", dsu.find("A"));

        dsu.union("A", "Y");

        assertSame(dsu.find("Z"), dsu.find("Y"));
        assertSame(dsu.find("A"), dsu.find("Z"));
    }
}