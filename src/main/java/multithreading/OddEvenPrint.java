package multithreading;

public class OddEvenPrint {

       volatile static int count = 1;
       int limit ;

       public OddEvenPrint(int limit){
           this.limit = limit;
       }

       public synchronized void printEven(){

              while(count<limit){
                    if(count%2==0){
                        System.out.println(Thread.currentThread().getName() +"->"+ count);
                        count++;
                        notifyAll();
                    }else{
                        try{
                            wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
              }
       }

       public synchronized void printOdd(){

        while(count<limit){
            if(count%2==1){
                System.out.println(Thread.currentThread().getName() +"->"+ count);
                count++;
                notifyAll();
            }else{
                try{
                    wait();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
         }
      }
}
