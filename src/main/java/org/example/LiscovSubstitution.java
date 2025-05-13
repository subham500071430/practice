package org.example;

public class LiscovSubstitution {

    public static void main(String[] args) {
        // parent class obj should be substituted in child class
        // without breaking the code
        BankAccount bankAccount = new FixedDepositAccount();
        bankAccount.withDrawAmount(10);  // does not work // throws unsupported exception
        // it violates LSP and to make it follow lsp
        // new class need to be created withDrawable account which will extend Bank account
    }
}
abstract class BankAccount {

       abstract void withDrawAmount(int amount);

       abstract void DepositAmount(int amount);


}

class CurrentAccount extends BankAccount {

    public void withDrawAmount(int amount){

    }

    public void DepositAmount(int amount){

    }
}

class SavingAccount extends BankAccount {

    public void withDrawAmount(int amount){

    }

    public void DepositAmount(int amount){

    }
}

class FixedDepositAccount extends BankAccount {

    public void withDrawAmount(int amount){

    }


    public void DepositAmount(int amount){
        // does not support this feature
        // it will throw error
    }
}




