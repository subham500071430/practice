package coreJava;

public class HashMapImpl {

    public static void main(String[] args) {

          MyHashMap<Integer,Integer> hm = new MyHashMap<>();

          hm.put(10,20);

          System.out.println(hm.get(10));

          hm.put(10,30);

          System.out.println(hm.get(10));
    }
}

