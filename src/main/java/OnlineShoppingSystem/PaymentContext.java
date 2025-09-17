package OnlineShoppingSystem;

public class PaymentContext {

       PaymentStrategy paymentStrategy;

       PaymentContext(PaymentStrategy paymentStrategy) {
              this.paymentStrategy = paymentStrategy;
       }

       public void ProcessPayment(int amount) {
              paymentStrategy.processPayment(amount);
       }
}
