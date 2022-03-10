package com.bull.algo.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSorterTest {

    @Test
    public void test() {

        for (int i = 0; i < 1000; i++) {
            int length = ThreadLocalRandom.current().nextInt(10);

            List<Integer> listToTest = new ArrayList<>();
            for (int k = 0; k < length; k++) {
                listToTest.add(ThreadLocalRandom.current().nextInt(20));
            }

            new InsertionSorter<Integer>().sort(listToTest);

            List<Integer> sorted = listToTest.stream().sorted().collect(Collectors.toList());

            Assertions.assertEquals(sorted, listToTest);
        }
    }
}