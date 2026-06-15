package takeUForward._11_GreedyAlg._2_MidHard;

import java.util.HashMap;

/**
 * Problem Statement:
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the LRUCache class:
 * <p>
 * LRUCache(int capacity): Initialize the LRU cache with positive size capacity.
 * int get(int key): Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value): Update the value of the key if the key exists.
 * Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * <p>
 * The functions get and put must each run in O(1) average time complexity.
 */
class LRU {
    HashMap<Integer, Node> hashMap;
    Node head, tail, current;
    int currentNo;
    final int capacity;

    public static class Node {
        public Node prev, next;
        int key, val;

        Node(int key, int val) {
            prev = null;
            next = null;
            this.key = key;
            this.val = val;
        }
    }

    /**
     * This defines the LRU class constructor
     *
     * @param capacity Defines the maximum number of objects available for Caching
     */
    public LRU(int capacity) {
        this.capacity = capacity;
        hashMap = new HashMap<>(capacity);
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        current = head;
        currentNo = 0;
    }

    /**
     * Return the value of the key if the key exists, otherwise return -1.
     *
     * @param key This is the job number given by key
     * @return It returns key if it exists
     */
    public int get(int key) {
        if (current == head)
            return -1;

        Node x = hashMap.getOrDefault(key, null);
        if (x != null) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            --currentNo;
        }

        return x == null ? -1 : x.val;
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            Node n = hashMap.get(key);
            n.val = value;
            return;
        }

        if (currentNo == capacity) {
            head.next = head.next.next;
            head.next.prev = head;
            currentNo--;
        }
        Node n = new Node(key, value);

        n.next = current.next;
        n.prev = current;
        current.next.prev = n;
        current.next = n;

        current = current.next;
        currentNo++;
    }

}


public class _8_LRU {
    static void main() {
        LRU lRUCache = new LRU(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }
}
