package com.bull.algo.util;

import java.util.List;

public class Utility {

    public static <T> void swap(List<T> list, int left, int right) {
        T tmp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, tmp);
    }
}
