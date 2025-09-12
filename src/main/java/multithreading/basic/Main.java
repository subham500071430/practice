package multithreading.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) {

           ExtendThread th = new ExtendThread();
           th.start();

           Thread th1 = new Thread(new ImplementingRunnable());
           th1.start();

           Callable<String> obj =  new ImplementingCallable();

           FutureTask<String> futureTask = new FutureTask<>(obj);

           Thread th2 = new Thread(futureTask);
           th2.start();
    }
}
