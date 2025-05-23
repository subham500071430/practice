package parkingLotProblem;

public interface ParkingLotSystem {

       public void createParkingLot(int lot);

       public void addFloor();

       public void addParkingSlot();

       public ParkingSlot availableParkingSlot();

       public Ticket createTicket(Vechile vechile);

       public void ParkVechile();

       public void unParkVechile();

}
