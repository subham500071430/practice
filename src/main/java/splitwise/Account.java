package splitwise;

public class Account {

    String name;
    String emailId;
    int accountBalance;

    Account(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
        this.accountBalance = 0;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}
