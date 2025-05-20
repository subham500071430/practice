package designPatterns.structural.SortUsers;

import java.util.ArrayList;
import java.util.List;

public class UserSorter {

    public static void main(String[] args) {

           User user3 = new User("Prakash",24);
           User user1 = new User("Aman",25);
           User user2 = new User("Subham", 22);


           List<User> users = new ArrayList<>();

           users.add(user1);
           users.add(user2);
           users.add(user3);

           SortStrategy byName = new SortByName();
           byName.sortUsers(users);
           users.stream().forEach((user) -> System.out.println(user.name + " " + user.age));
           SortStrategy byAge = new SortByAge();
           byAge.sortUsers(users);
           users.stream().forEach((user) -> System.out.println(user.name + " " + user.age));


    }
}
