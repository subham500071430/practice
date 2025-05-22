package Q1;

public class ParkingLot {

    int id;
    int floor;
    Vechile parked_vechile;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Vechile getParked_vechile() {
        return parked_vechile;
    }

    public void setParked_vechile(Vechile parked_vechile) {
        this.parked_vechile = parked_vechile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isParkingLotAvailable(){
               return parked_vechile == null;
    }
}
