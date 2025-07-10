package multithreading.reader.writer;

import java.util.concurrent.locks.ReentrantLock;

public class Resource {

       private int readerCount = 0;
       private final ReentrantLock readlock = new ReentrantLock();
       private final ReentrantLock writelock = new ReentrantLock();

       public void readData(){

              readlock.lock();

              try {
                  readerCount++;
                  if(readerCount == 1){
                      writelock.lock();
                  }
              } finally {
                  readlock.unlock();
              }


              System.out.println("reading Data");

              readlock.lock();

              try {
                  readerCount--;
                  if(readerCount == 0){
                      writelock.unlock();
                  }
              } finally {
                  readlock.unlock();
              }

       }

       public void writeData(){

              writelock.lock();

              try {
                  System.out.println("wrote to data");
              } finally {
                  writelock.unlock();
              }
       }
}
