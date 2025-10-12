package multithreading;

public class PrintOddEven {

    static int count = 0;
    static int limit = 100;

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

                synchronized (PrintOddEven.class) {

                    while (count <= limit) {

                        if (count % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + " " + count++);
                            PrintOddEven.class.notify();
                        } else {
                            try {
                                PrintOddEven.class.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {

                synchronized (PrintOddEven.class) {
                    while (count <= limit) {

                        if (count % 2 == 1) {
                            System.out.println(Thread.currentThread().getName() + " " + count++);
                            PrintOddEven.class.notify();
                        } else {
                            try {
                                PrintOddEven.class.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

        // both synchronized block should share same monitor object for locking
    }
}

