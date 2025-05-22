package Q1;

public class ParkingLot {

       int id;
       int floor;
       Vechile parked_vechile;


       ParkingLot(int id,int floor){
            this.id = id;
            this.floor = floor;
       }

       public boolean isParkingLotAvailable(){
               return parked_vechile == null;
       }
}
