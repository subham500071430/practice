package Q1;

import java.util.List;

public class Vechile {

       String num;

       public String getNum() {
              return num;
       }

       List<Receipt> receipts;
       VechileType vechileType;
       ParkingLot parkingLot;

       Vechile(String num,VechileType vechileType){
              this.num = num;
              this.vechileType = vechileType;
       }

       public void mapToReceipt(Receipt receipt){
              receipts.add(receipt);
       }

       public void mapToParkingLot(ParkingLot parkingLot){
              this.parkingLot = parkingLot;
       }

}
