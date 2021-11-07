package com.bull.algo.sort;

import java.util.List;

public class InsertionSorter<T extends Comparable<T>> {
    
    public void sort(List<T> list) {

        for (int i = 1; i < list.size(); i++) {

            T element = list.get(i);
            int k = i - 1;
            while (k >= 0 && (list.get(k).compareTo(element) > 0)) {
                list.set(k + 1, list.get(k));
                k--;
            }

            list.set(k + 1, element);
        }
    }
}
