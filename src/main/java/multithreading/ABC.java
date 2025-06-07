package multithreading;

public class ABC {

       static int limit = 10;
       static volatile int count = 0;
       static volatile char c = 'A';

       public synchronized void printA(){

           while(count<limit){

                 if(c == 'A'){
                     System.out.print(c);
                     c = 'B';
                     notifyAll();
                 }
                 else{
                     try {
                         wait();
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
           }
       }

       public synchronized void printB(){

          while(count<limit){

            if(c == 'B'){
                System.out.print(c);
                c = 'C';
                notifyAll();
            }
             else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
             }
          }
       }

       public synchronized void printC(){

           while(count<limit){

               if(c == 'C'){
                   System.out.print(c);
                   c = 'A';
                   count++;
                   notifyAll();
               }
               else{
                   try {
                       wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
       }
}
