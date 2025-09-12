package OnlineShoppingSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {

       Map<Product , Integer> items;

       Cart() {
           items = new HashMap<>();
       }

       public boolean addToCart(Product p) {
              return true;
       }

       public boolean removeFromCart(Product product) {
              return  true;
       }
}
