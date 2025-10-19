package cache;

public class User {

    public static void main(String[] args) {

        LruCache lruCache = new LruCache(2);

        lruCache.put(10, 1);
        lruCache.put(11, 2);
        lruCache.put(12, 3);
        lruCache.put(13, 4);
        lruCache.put(14, 5);
        lruCache.put(15, 6);
        System.out.println(lruCache.get(14));
    }
}
