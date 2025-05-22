package Q1;

public class Client {

    public static void main(String[] args) {

           ParkingLotSystem parkingLotSystem = new ParkingLotSystemImpl(40);

           Vechile vechile1 = new Vechile("KA01JY0407",VechileType.TWO_WHEELER);
           User user1 = new User("Subham",vechile1);

           Vechile vechile2 = new Vechile("KA01JY0408",VechileType.TWO_WHEELER);
           User user2 = new User("Aman",vechile2);

           // let's assume we have 2 floor

           parkingLotSystem.park(vechile1,3);
           parkingLotSystem.park(vechile2,3);
           parkingLotSystem.unPark(vechile1);

    }
}
