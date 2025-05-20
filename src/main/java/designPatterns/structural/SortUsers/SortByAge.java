package designPatterns.structural.SortUsers;

import java.util.List;

public class SortByAge implements SortStrategy{

    @Override
    public void sortUsers(List<User> users) {
          users.sort((user1,user2) -> user1.age - user2.age );
    }
}
