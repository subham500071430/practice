package designPatterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {

           PaymentStrategy paymentStrategy = new CreditCardPayment();
           PaymentContext context = new PaymentContext(paymentStrategy);
           context.processPayment();
    }
}
