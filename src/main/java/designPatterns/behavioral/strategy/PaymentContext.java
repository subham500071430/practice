package designPatterns.behavioral.strategy;

public class PaymentContext {

       PaymentStrategy paymentStrategy;

       PaymentContext(PaymentStrategy paymentStrategy){
           this.paymentStrategy = paymentStrategy;
       }

       public void processPayment() {
              paymentStrategy.pay();
       }
}
