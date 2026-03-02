package ParkingLot;

import ParkingLot.Payment.Payment;

public class MainParkingLot {
   private ParkingBuilding parkingBuilding;
   private EntranceGate entranceGate;
   private ExitGate exitGate;

    public MainParkingLot(ParkingLot.ParkingBuilding parkingBuilding, ParkingLot.EntranceGate entranceGate, ParkingLot.ExitGate exitGate) {
        this.parkingBuilding = parkingBuilding;
        this.entranceGate = entranceGate;
        this.exitGate = exitGate;
    }

    public Ticket vehicleArrives(Vehicle vehicle){
        return this.entranceGate.enter(this.parkingBuilding,vehicle);
    }

    public void vehicleExits(Ticket ticket, Payment payment){
        this.exitGate.exit(this.parkingBuilding,ticket,payment);
    }

}
