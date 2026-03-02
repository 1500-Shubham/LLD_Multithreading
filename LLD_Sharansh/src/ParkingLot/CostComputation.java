package ParkingLot;

import ParkingLot.PricingStrategy.PricingStrategy;

public class CostComputation {
    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double cal(Ticket ticket){
      return this.pricingStrategy.calculate(ticket);
    }
}
