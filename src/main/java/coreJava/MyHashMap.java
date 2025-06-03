package coreJava;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    private int initial_capacity = 16;
    private double load_factor = 0.75d;
    private LinkedList<Node<K, V>>[] map;
    private int size;

    MyHashMap() {
        map = new LinkedList[this.initial_capacity];
    }

    MyHashMap(int intitial_capacity) {
        this.initial_capacity = intitial_capacity;
        map = new LinkedList[intitial_capacity];
    }

    MyHashMap(int intitial_capacity, int load_factor) {
        this.initial_capacity = intitial_capacity;
        this.load_factor = load_factor;
        map = new LinkedList[intitial_capacity];
    }

    public V get(K key) {
        int index = hash(key);
        if(map[index] == null)
             return null;

        for (Node node : map[index]) {
            if (node.key == key) {
                return (V) node.value;
            }
        }
        return null;
    }

    public void put(K key, V value) {

        int index = hash(key);

        if (map[index] == null) {
            map[index] = new LinkedList<>();
            map[index].add(new Node(key, value));
            size++;
        } else {
            for (Node node : map[index]) {
                if (node.key == key) {
                    node.value = value;
                }
            }
        }

        if (size >= (int) (load_factor * map.length)) {
            resize();
        }
    }

    public boolean containsKey(K key){
           int index = hash(key);
           return map[index] != null;
    }

    public int size() {
        return size;
    }

    public void resize() {
        LinkedList<Node<K, V>>[] newMap = new LinkedList[2 * map.length];
        System.arraycopy(map, 0, newMap, 0, newMap.length);
        map = newMap;
    }

    public int hash(K key) {
        return (int) key % map.length;
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