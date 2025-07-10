package multithreading.producer.consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {

    final int size = 1000;
    volatile BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);

    public void addData(Integer data) {

        try {
            queue.put(data);
            System.out.println("Produced "+data);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    public void removeData() {

        try {
            int data = queue.take();
            System.out.println("Consumed "+data);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
