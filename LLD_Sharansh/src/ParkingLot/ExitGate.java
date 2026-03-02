package ParkingLot;

import ParkingLot.Payment.Payment;

public class ExitGate {
    private CostComputation costComputation;

    public ExitGate(CostComputation costComputation) {
        this.costComputation = costComputation;
    }

    public void exit(ParkingBuilding building, Ticket ticket, Payment payment){
        double amount = costComputation.cal(ticket);
        payment.pay(amount); //amount paid
        building.release(ticket);
    }
}
