package designPatterns.behavioral.strategy;

public class UpiPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("payment done using upi payment");
    }
}
