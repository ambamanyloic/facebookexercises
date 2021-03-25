package com.loic.projectfacebook.leetcode.medium;

import java.util.*;

class LRUCache {
    private int capacity;
    Map<Integer,Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

    }
    public int get(int key) {
        int value = 0;
        if(map.containsKey(key)) {
            value = map.get(key);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        this.map.put(key, value);
    }

    public void removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
        //return this.size() > this.capacity;
    }


    /*class LRUCache extends LinkedHashMap<K,V> {
        private int capacity;

    public LinkedhashMapWithCapacity(int capacity) {
            super(16, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
            return this.size() > this.capacity;
        }
    }

    public class LRUCache {

        private LinkedhashMapWithCapacity<Integer,Integer> map;

        public LRUCache(int capacity) {
            this.map = new LinkedhashMapWithCapacity<>(capacity);
        }

        public int get(int key) {
            Integer value = this.map.get(key);
            if (value == null) {
                value = -1;
            }
            return value;
        }

        public void put(int key, int value) {
            this.map.put(key, value);
        }*/

}
