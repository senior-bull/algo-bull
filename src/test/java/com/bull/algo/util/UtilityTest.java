package com.bull.algo.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    public void shouldSwapElements() {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(List.of("A", "B", "C"), list);

        Utility.swap(list, 0, 2);

        assertEquals(List.of("C", "B", "A"), list);
    }
}