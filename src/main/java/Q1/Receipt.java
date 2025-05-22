package Q1;

public class Receipt {

       int receiptId;
       int amount;
       Vechile vechile;

       public void createReceipt(int receiptId,int amount,Vechile vechile){
             this.receiptId = receiptId;
             this.amount = amount;
             this.vechile = vechile;
             vechile.mapToReceipt(this);
       }

}
