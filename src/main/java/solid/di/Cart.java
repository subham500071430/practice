package solid.di;

public class Cart {
       // tight coupling
       Logger logger;

       public void addToCart(){
              logger.printLogs();
       }

       public void deleteFromCart(){

       }
}

// a high level module should not depend upon a low level module directly
// there should be an abstraction layer between them




