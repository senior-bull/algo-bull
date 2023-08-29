package com.bull.concurrent.counters;

import org.jctools.maps.ConcurrentAutoTable;

public class ConcurrentAutoTableTest {

    public static void main(String[] args) {
        ConcurrentAutoTable cat = new ConcurrentAutoTable();

        cat.add(55L);
        cat.add(77L);
        cat.add(42L);

        System.out.println(cat);
    }
}
