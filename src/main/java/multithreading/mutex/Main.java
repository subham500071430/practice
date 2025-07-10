package multithreading.mutex;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Resource resource = new Resource();

         Thread threadA = new Thread(() -> {

             for(int i=0;i<100;i++){
                 resource.incrementCounter();
             }

         });

        Thread threadB = new Thread(() -> {

            for(int i=0;i<100;i++){
                resource.incrementCounter();
            }

        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println(resource.counter);

    }
}
