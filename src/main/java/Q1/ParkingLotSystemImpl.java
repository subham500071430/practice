package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ParkingLotSystemImpl implements ParkingLotSystem {

    List<ParkingLot> parkingLots;
    List<Receipt> receipts;

    public ParkingLotSystemImpl(int size){
           parkingLots = new ArrayList<>(size);
           int i = 1;
           for(ParkingLot parkingLot : parkingLots){
               parkingLot.setId(i);
               parkingLot.setFloor((i/10)+1);
               i++;
           }
    }

    public boolean park(Vechile vechile, int id) {
        Optional<ParkingLot> parkingLot  = parkingLots
                                               .stream()
                                               .filter(p -> p.getId() == id)
                                               .findFirst();
        if(parkingLot.isEmpty())
             return false;

        ParkingLot parkingLot1 = parkingLot.get();

        if(parkingLot1.isParkingLotAvailable()){
           parkingLot1.parked_vechile = vechile;
           Receipt receipt = new Receipt(receipts.size()+1,10,vechile);
           vechile.mapToReceipt(receipt);
           vechile.mapToParkingLot(parkingLot.get());
           receipts.add(receipt);
           System.out.println("Parked Vechile : "+ vechile.getNum()+" at "+parkingLot1.getId() );
           return true;
        }

        return false;
    }

    public boolean unPark(Vechile vechile) {
           if(vechile.parkingLot == null){
               return false;
           }else{
               vechile.mapToParkingLot(null);
               System.out.println("UnParked Vechile : "+ vechile.getNum()+" at "+vechile.parkingLot.getId());
               return true;
           }
    }

    public List<ParkingLot> getAvailableParkingLots() {

        return parkingLots
                .stream()
                .filter(parkingLot -> parkingLot.isParkingLotAvailable())
                .collect(Collectors.toList());
    }

}
