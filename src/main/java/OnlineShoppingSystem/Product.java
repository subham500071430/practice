package OnlineShoppingSystem;

public class Product {

       int id;
       String name;
       String desc;
       Category category;
       boolean isAvailable;
       int price;

       Product(int id,String name,String desc,Category category,int price) {
           this.id = id;
           this.name = name;
           this.desc = desc;
           this.category = category;
           this.price = price;
       }
}
