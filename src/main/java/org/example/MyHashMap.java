package org.example;

import java.util.LinkedList;

public class MyHashMap<K,V> {

       // method to implement ...put get containsKey resize

       LinkedList<Node<K,V>>[] map;
       private static final int initial_capacity = 16;
       private static final double load_factor = 0.75d;
       private static int size = 0;

       static class Node<K,V> {
           K key;
           V value;
           Node<K,V> next;

           Node(K key,V value){
               this.key = key;
               this.value = value;
               this.next = null;
           }
       }

       //constructor;
       public MyHashMap(){
              map = new LinkedList[initial_capacity];
       }

       public int hash(K key){
              return (int)hashCode(key)%map.length;
       }

       public void put(K key,V value){

              int index = hashCode(key);

              if(map[index]==null){
                  map[index] = new LinkedList<>();
                  map[index].add(new Node(key,value));
              }
              else{

                  LinkedList<Node<K,V>> list = map[index];

                  for(Node<K,V> node : list){
                         if(node.key == key){
                             node.value = value;
                             return ;
                         }
                  }

              }

              size++;
       }

       public V get(K key){

              int index = hash(key);

              if(map[index]!=null) {
                  for (Node<K, V> node : map[index]) {

                      if (node.key == key) {
                          return node.value;
                      }
                  }
              }
              return null;
       }

       public boolean containsKey(K key){

              if(map[hash(key)] != null){
                   for(Node<K,V> node : map[hash(key)]){
                       if(node.key == key) return true;
                   }
              }

              return false;
       }

       public boolean remove(K key){

             if(map[hash(key)] != null){
                  for(Node<K,V> node : map[hash(key)]){
                      if(node.key == key){
                          map[hash(key)].remove(node);
                          size--;
                          return true;
                      }
                  }
             }

             return false;
       }

       public int size(){
              return size;
       }

       private int hashCode(K key) {
            return (int)key*5;
       }
}
