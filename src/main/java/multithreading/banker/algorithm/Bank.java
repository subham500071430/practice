package multithreading.banker.algorithm;

public class Bank {

    private int total_money;
    private int bank_money;

    Bank(int total_money, int bank_money){
        this.total_money = total_money;
        this.bank_money = bank_money;
    }

    public synchronized void sanctionLoan(int loan_amount){

        try {
            while (bank_money - loan_amount < total_money)
                wait();
        } catch (InterruptedException e){
             Thread.currentThread().interrupt();
        }

        bank_money = bank_money - loan_amount;
        System.out.println("sanctioned loan "+loan_amount);

    }

}


/*

Suppose there are n number of account holders in a bank and the total sum of their money is S.
Let us assume that the bank has a certain amount of money Y.
If a person applies for a loan then the bank first subtracts the loan amount
from the total money that the bank has (Y) and if the remaining amount is greater than S then
only the loan is sanctioned

 */
