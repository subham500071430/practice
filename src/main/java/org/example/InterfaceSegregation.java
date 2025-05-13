package org.example;

public class InterfaceSegregation {

    public static void main(String[] args) {
          // A class should not be forced to implement methods it does
          // not need.
    }
}

interface ISVPaymentProcessor {

       public void processCreditCardPayment();
       public void processUPIPayment();
}

class CreditCardPaymentProcessor implements ISVPaymentProcessor{

    @Override
    public void processCreditCardPayment() {

    }

    @Override
    public void processUPIPayment() {
           // this class does not need this method
          // so in this interface needs to be segregated
    }
}

interface ISCreditCardPayment {

    public void processCreditCardPayment();
}

interface ISUPIPayment {

    public void processUPIPayment();
}
