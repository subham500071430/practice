package coreJava;

public class HashMapImpl {

    public static void main(String[] args) {

          MyHashMap<Integer,Integer> hm = new MyHashMap<>();

          hm.put(10,20);
          hm.put(10,30);
          hm.put(10,40);

          System.out.println(hm.get(10));
          System.out.println(hm.get(20));

    }
}

