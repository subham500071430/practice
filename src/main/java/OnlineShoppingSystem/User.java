package OnlineShoppingSystem;

import java.util.ArrayList;

public class User {

      int id;
      String name;
      Cart cart;
      ArrayList<Order> orderHistory;

      User(int id , String name) {
           this.id = id;
           this.name = name;
           orderHistory = new ArrayList<>();
      }

      public ArrayList<Order> getOrderHistory() {
           return orderHistory;
      }

      public Cart getCart() {
           return cart;
      }
}
