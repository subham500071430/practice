package multithreading.banker.algorithm;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(1000, 999999);

        Thread thread = new Thread(() -> {
            bank.sanctionLoan(100);
        });

        thread.start();
    }
}
