package splitwise;

import java.util.Map;

public class SplitWiseSystemImpl implements SplitWiseSystem{

    Map<User,Account> accounts;

    @Override
    public Account createAccount(String name, String emailId) {
           return new Account(name, emailId);
    }


}
