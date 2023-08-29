package com.bull.datastructure.trie;

import com.bull.datastructure.trie.PersistentHashArrayMappedTrie.Node;
import org.junit.jupiter.api.Assertions;

public class PersistentHashArrayMappedTrieExample {

    public static void main(String[] args) {
        Node<String, String> root1 = PersistentHashArrayMappedTrie.put(null, "A", "B");

        Assertions.assertEquals("B", PersistentHashArrayMappedTrie.get(root1, "A"));

        Node<String, String> root2 = PersistentHashArrayMappedTrie.put(root1, "C", "D");

        // check persistence
        Assertions.assertNull(PersistentHashArrayMappedTrie.get(root1, "C"));
        Assertions.assertEquals("D", PersistentHashArrayMappedTrie.get(root2, "C"));
    }
}
