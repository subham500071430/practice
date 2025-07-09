package designPatterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("payment done using paypal");
    }
}
