package com.bull.concurrent.maps;

import org.jctools.maps.NonBlockingHashMap;

public class NonBlockingHashMapTest {

    public static void main(String[] args) {

        NonBlockingHashMap<String, Integer> map = new NonBlockingHashMap<>();

        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("D"));

        System.out.println(map.size());
    }
}
