package multithreading;

public class OddEven {

    volatile static int count = 1;

    public static void main(String[] args) {

           OddEvenPrint oddEvenPrint = new OddEvenPrint(20);

           Thread t1 = new Thread(new Runnable() {
               @Override
               public void run() {
                     oddEvenPrint.printEven();
               }
           });

           Thread t2 = new Thread(new Runnable() {
              @Override
              public void run() {
                    oddEvenPrint.printOdd();
              }
           });

           t1.setName("Thread A");
           t2.setName("Thread B");

           t1.start();
           t2.start();
    }
}
