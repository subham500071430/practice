package OnlineShoppingSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    public Map<Product, Integer> getInventory() {
        return Inventory.inventory;
    }

    private static class Inventory {
           private static final Map<Product,Integer> inventory = new HashMap<>();
    }

    public void addProduct(Product product) {

           Map<Product,Integer> inventory = getInventory();

           if(inventory.containsKey(product)) {

           } else {

           }
    }
}
