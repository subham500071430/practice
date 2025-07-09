package producer.consumer;

public class Consumer implements Runnable {

    Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
              int i = 0;
              while(i<1000){
                  buffer.removeData();
                  i++;
              }

    }
}
