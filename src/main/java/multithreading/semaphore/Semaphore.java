package multithreading.semaphore;

import java.util.concurrent.atomic.AtomicInteger;

class Semaphore {

    private final int max_limit;
    private final AtomicInteger limit;

    public Semaphore(int max_limit) {
        this.max_limit = max_limit;
        this.limit = new AtomicInteger(0);
    }

    public synchronized void P(int i) {

        try {
            while (limit.get() == max_limit) {
                wait();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("acquired lock " + i);

        limit.incrementAndGet();

        notifyAll();

    }

    public synchronized void V(int i) {

        try {
            while (limit.get() == 0) {
                wait();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("released lock " + i);

        limit.decrementAndGet();

        notifyAll();
    }
}

