package designPatterns.structural.SortUsers;

import java.util.List;

public class SortByName implements SortStrategy{


    @Override
    public void sortUsers(List<User> users) {

           users.sort((user1,user2) -> user1.name.compareTo(user2.name));
    }
}
