package com.bull.algo.trie;

import com.bull.algo.trie.PersistentHashArrayMappedTrie.Node;
import org.junit.jupiter.api.Assertions;

public class PersistentHashArrayMappedTrieTest {

    public static void main(String[] args) {
        Node<String, String> root1 = PersistentHashArrayMappedTrie.put(null, "A", "B");

        Assertions.assertEquals("B", PersistentHashArrayMappedTrie.get(root1, "A"));

        Node<String, String> root2 = PersistentHashArrayMappedTrie.put(root1, "C", "D");

        // check persistence
        Assertions.assertNull(PersistentHashArrayMappedTrie.get(root1, "C"));
        Assertions.assertEquals("D", PersistentHashArrayMappedTrie.get(root2, "C"));
    }
}
