package ParkingLot.PricingStrategy;

import ParkingLot.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
