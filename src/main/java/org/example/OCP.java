package org.example;

public class OCP {

    public static void main(String[] args) {

    }
}

class PaymentProcessor {

      // process only credit card payments.
    /*
      public void processCreditCardPayments(){

      }
*/
      // if I need to process upi payments and I change the existing code
      // it violates open-close principle as I am changing PaymentProcessor class to handle
      //  new feature which can introduce new bugs and make it complex
      // to overcome this I will create a new parent class PaymentProcessor
      // creditCardPayment and UPI payment class can extend it

       public void processPayment(){

       }

}

class UPIPayment extends PaymentProcessor{

      @Override
      public void processPayment(){
           // implement upi payment logic
      }
}

class CreditCardPayment extends PaymentProcessor{

      @Override
      public void processPayment(){
          // implement credit card payment
      }
}
