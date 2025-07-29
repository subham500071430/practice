package multithreading;

public class PrintABC {

    public static void main(String[] args) {

           ABC obj = new ABC();
           Thread thread1 = new Thread(()-> obj.printA());
           Thread thread2 = new Thread(()-> obj.printB());
           Thread thread3 = new Thread(()-> obj.printC());

           thread1.start();
           thread2.start();
           thread3.start();


    }

    public int binarySearch() {
          findMiddle();
          return 0;
    }

    public static void findMiddle(){
        return;
    }

}
