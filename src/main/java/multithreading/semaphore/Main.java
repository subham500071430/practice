package multithreading.semaphore;

public class Main {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(100);

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                semaphore.P(i);
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                semaphore.V(i);
        });

        threadA.start();
        threadB.start();
    }
}
