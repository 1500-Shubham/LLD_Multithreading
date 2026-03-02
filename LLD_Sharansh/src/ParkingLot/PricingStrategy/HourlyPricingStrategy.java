package ParkingLot.PricingStrategy;

import ParkingLot.Ticket;

import java.time.LocalDateTime;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        int hours = LocalDateTime.now().getHour()-ticket.entryTime.getHour();
        if(hours==0)
            return 100;
        else
            return 100*hours;
    }
}
