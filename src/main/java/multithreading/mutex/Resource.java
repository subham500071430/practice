package multithreading.mutex;

import java.util.concurrent.locks.ReentrantLock;

public class Resource {

       int counter;
       private final ReentrantLock lock  = new ReentrantLock();

       public void incrementCounter(){

           lock.lock();

           try {
               counter++;
           } finally {
               lock.unlock();
           }

       }
}
