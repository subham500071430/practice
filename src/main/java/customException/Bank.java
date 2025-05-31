package customException;

public class Bank {

    int balance = 50;

    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            bank.withDraw(60);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void withDraw(int amount) throws TransactionProcessorException {

        if (amount > balance) {
            throw new TransactionProcessorException("Insufficient Balance");
        } else {
            System.out.println("Transaction Successful");
        }
    }
}

class TransactionProcessorException extends Exception {

    TransactionProcessorException(String msg) {
        super(msg);
    }
}
