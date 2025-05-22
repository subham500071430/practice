package Q1;

import java.util.List;

public class Vechile {

       String num;
       List<Receipt> receipts;
       VechileType vechileType;
       User owner;

       Vechile(String num,VechileType vechileType,User owner){
              this.num = num;
              this.vechileType = vechileType;
              this.owner = owner;
       }

       public void mapToReceipt(Receipt receipt){
              receipts.add(receipt);
       }

}
