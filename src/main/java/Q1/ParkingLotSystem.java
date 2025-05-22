package Q1;

import java.util.List;

public interface ParkingLotSystem {

       public boolean park(Vechile vechile, int id);

       public boolean unPark(Vechile vechile);

       public List<ParkingLot> getAvailableParkingLots();

}
