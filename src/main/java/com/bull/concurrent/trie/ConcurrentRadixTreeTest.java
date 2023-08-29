package com.bull.concurrent.trie;

import com.googlecode.concurrenttrees.common.Iterables;
import com.googlecode.concurrenttrees.common.PrettyPrinter;
import com.googlecode.concurrenttrees.radix.ConcurrentRadixTree;
import com.googlecode.concurrenttrees.radix.node.concrete.DefaultCharArrayNodeFactory;
import com.googlecode.concurrenttrees.radix.node.util.PrettyPrintable;

public class ConcurrentRadixTreeTest {

    public static void main(String[] args) {
        ConcurrentRadixTree<Integer> tree = new ConcurrentRadixTree<>(new DefaultCharArrayNodeFactory());

        tree.put("TEST", 1);
        tree.put("TOAST", 2);
        tree.put("TEAM", 3);

        System.out.println("Tree structure:");
        // PrettyPrintable is a non-public API for testing, prints semi-graphical representations of trees...
        PrettyPrinter.prettyPrint((PrettyPrintable) tree, System.out);

        System.out.println();
        System.out.println("Value for 'TEST' (exact match): " + tree.getValueForExactKey("TEST"));
        System.out.println("Value for 'TOAST' (exact match): " + tree.getValueForExactKey("TOAST"));
        System.out.println();
        System.out.println("Keys starting with 'T': " + Iterables.toString(tree.getKeysStartingWith("T")));
        System.out.println("Keys starting with 'TE': " + Iterables.toString(tree.getKeysStartingWith("TE")));
        System.out.println();
        System.out.println("Values for keys starting with 'TE': " + Iterables.toString(tree.getValuesForKeysStartingWith("TE")));
        System.out.println("Key-Value pairs for keys starting with 'TE': " + Iterables.toString(tree.getKeyValuePairsForKeysStartingWith("TE")));
        System.out.println();
        System.out.println("Keys closest to 'TEMPLE': " + Iterables.toString(tree.getClosestKeys("TEMPLE")));
    }
}
