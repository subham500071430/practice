package Q1;

public class Client {

    public static void main(String[] args) {

           ParkingLotSystem parkingLotSystem = new ParkingLotSystemImpl(40);

           Vechile vechile = new Vechile("KA01JY0407",VechileType.TWO_WHEELER);
           User user = new User("Subham",vechile);

           // let's assume we have 2 floor

           parkingLotSystem.park(vechile,3);
           parkingLotSystem.unPark(vechile);

    }
}
