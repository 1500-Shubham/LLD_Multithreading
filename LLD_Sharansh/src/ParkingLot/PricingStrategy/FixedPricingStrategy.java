package ParkingLot.PricingStrategy;

import ParkingLot.Enums.VehicleType;
import ParkingLot.Ticket;

public class FixedPricingStrategy implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        switch (ticket.vehicle.getVehicleType()){
            case VehicleType.TWO_WHEELER: return 100;
            case VehicleType.FOUR_WHEELER: return 200;
            default: return 0;
        }

    }
}
