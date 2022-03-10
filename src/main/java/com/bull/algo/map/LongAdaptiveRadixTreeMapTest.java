package com.bull.algo.map;

import exchange.core2.collections.art.LongAdaptiveRadixTreeMap;
import org.junit.jupiter.api.Assertions;

public class LongAdaptiveRadixTreeMapTest {

    public static void main(String[] args) {
        LongAdaptiveRadixTreeMap<String> map = new LongAdaptiveRadixTreeMap<>();

        map.put(5L, "A");

        Assertions.assertEquals("A", map.get(5L));

        map.put(7L, "C");

        Assertions.assertEquals("C", map.get(7L));

        System.out.println(map.printDiagram());
    }
}
