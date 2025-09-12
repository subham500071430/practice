package OnlineShoppingSystem;

public abstract class Payment {

       int transactionId;
       PaymentStatus status;
       Order order;

       public abstract void processPayment(int amount);
}
