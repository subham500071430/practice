package OnlineShoppingSystem;

public class Order {

       int id;
       OrderStatus orderStatus;
       User user;
       PaymentStatus paymentStatus;

       public OrderStatus getOrderStatus() {
        return orderStatus;
       }

       public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
       }


}
