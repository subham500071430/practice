package cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LruCache {

    private final int capacity;
    private final Map<Integer, Node> map;
    private Node head;
    private Node tail;

    LruCache(int capacity) {
        this.capacity = capacity;
        map = new ConcurrentHashMap<>();
    }

    public synchronized void put(int key, int value) {

        if (map.containsKey(key)) {
            map.get(key).setValue(value);
            updateHeadAndTail(map.get(key));
        } else {

            Node curr = new Node(key, value);
            map.put(key, curr);

            addNode(curr);

            if (map.size() > capacity) {
                map.remove(tail.getKey());
                Node temp = tail;
                tail = tail.prev;
                temp.prev = null;
                if (tail != null) {
                    tail.next = null;
                }
            }
        }
    }

    public synchronized int get(int key) {

        if (map.isEmpty()) return -1;

        Node curr = map.get(key);

        if (curr == null) return -1;

        updateHeadAndTail(curr);

        return curr.getValue();
    }

    public void addNode(Node curr) {

        if (head == null) {
            head = curr;
            tail = curr;
        } else {
            curr.next = head;
            head.prev = curr;
            head = curr;
        }
    }

    public void updateHeadAndTail(Node node) {

        if(node != head && node != tail) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = head;
            head.prev = node;
            node.prev = null;
            head = node;
        } else if(node != head){
            tail = tail.prev;
            node.prev = null;
            node.next = head;
            head.prev = node;
            tail.next = null;
            head = node;
        }
    }

}
