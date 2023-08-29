package com.bull.datastructure.map;

import io.timeandspace.smoothie.SmoothieMap;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class SmoothieMapTest {

    /*
    SmoothieMap is a Map implementation for Java with the lowest memory usage and absence of rehash latency spikes.
    Under the hood, it is a version of extendible hashing with 48-slot mini segments.
    */

    public static void main(String[] args) {

        Map<String, String> myMap = SmoothieMap.<String, String>newBuilder().build();

        for (int i = 0; i < 50; i++) {
            myMap.put(String.valueOf(ThreadLocalRandom.current().nextInt()), "vbvv");
        }

        System.out.println(myMap.size());
    }
}
