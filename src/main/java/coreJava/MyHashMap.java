package coreJava;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    private int initial_capacity = 16;
    private double load_factor = 0.75;
    private LinkedList<Node<K, V>>[] map;
    private int size;

    public MyHashMap() {
        map = new LinkedList[initial_capacity];
    }

    public MyHashMap(int initial_capacity) {
        this.initial_capacity = initial_capacity;
        map = new LinkedList[initial_capacity];
    }

    public MyHashMap(int initial_capacity, double load_factor) {
        this.initial_capacity = initial_capacity;
        this.load_factor = load_factor;
        map = new LinkedList[initial_capacity];
    }

    public V get(K key) {
        int index = hash(key);
        if (map[index] == null) return null;

        for (Node<K, V> node : map[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (map[index] == null) {
            map[index] = new LinkedList<>();
        }

        for (Node<K, V> node : map[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        map[index].add(new Node<>(key, value));
        size++;

        if (size >= (int) (load_factor * map.length)) {
            resize();
        }
    }

    public boolean containsKey(K key) {
        int index = hash(key);
        if (map[index] == null) return false;

        for (Node<K, V> node : map[index]) {
            if (node.key.equals(key)) return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private void resize() {
        LinkedList<Node<K, V>>[] oldMap = map;
        map = new LinkedList[2 * oldMap.length];
        size = 0;

        for (LinkedList<Node<K, V>> bucket : oldMap) {
            if (bucket != null) {
                for (Node<K, V> node : bucket) {
                    put(node.key, node.value);
                }
            }
        }
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % map.length;
    }

    static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
