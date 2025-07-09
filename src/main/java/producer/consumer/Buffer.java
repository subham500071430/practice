package producer.consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    volatile Queue<Integer> queue = new LinkedList<>();
    final int size = 1000;


    public synchronized void addData(Integer data){

           try {
               while (queue.size() >= size)
                      wait();

               System.out.println("Produced data "+ data);
               queue.add(data);
               notifyAll();
           }
           catch(InterruptedException e){
                Thread.currentThread().interrupt();
           }

    }

    public synchronized void removeData(){

           try{
               while(queue.isEmpty())
                     wait();
               System.out.println("Consumed data "+queue.remove());
               notifyAll();
           } catch(InterruptedException e) {
               Thread.currentThread().interrupt();
           }

    }
}
