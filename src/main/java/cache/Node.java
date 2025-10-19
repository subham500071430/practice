package cache;

public class Node {

    Node prev;
    Node next;
    private int key;
    private int value;

    public Node(int key, int value) {
        prev = null;
        next = null;
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
