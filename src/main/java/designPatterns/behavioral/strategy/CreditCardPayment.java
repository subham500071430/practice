package designPatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("payment done using credit card payment");
    }
}
