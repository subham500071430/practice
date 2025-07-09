package producer.consumer;

public class Producer implements Runnable {

    Buffer buffer;
    int data = 0;

    public Producer(Buffer buffer){
         this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0;
        while(i<1000){
            buffer.addData(data++);
            i++;
        }
    }

}
