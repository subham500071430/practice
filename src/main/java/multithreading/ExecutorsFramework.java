package multithreading;

import java.util.concurrent.CountDownLatch;

public class ExecutorsFramework {

    public static void main(String[] args) {
/*
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // it gives a single thread in java which is ready to run
        // it will run sequentially

        executorService.submit(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

         executorService.shutdown();

         // it gives option of fixed size threadpool which are ready to execute
         ExecutorService executorService1 = Executors.newFixedThreadPool(10);
         Thread[] threads = new Thread[10];

         executorService1.submit(() -> {
                System.out.println("Hello");
         });

         executorService1.submit(()->{
               for(int i=0;i<10;i++){
                   try {
                       threads[i].join();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
         });

         executorService1.shutdown();
        // */

        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread threadA = new Thread(() -> {
            countDownLatch.countDown();
            System.out.println("Hello Thread-A");
        });
        Thread threadB = new Thread(() -> {
            countDownLatch.countDown();
            System.out.println("Hello Thread-B");
        });

        threadB.start();
        threadA.start();


        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

// mention the count in countdown latch so that so it will wait for that no of threads to wait before execution
// main thread will wait until all worker thread have completed their execution