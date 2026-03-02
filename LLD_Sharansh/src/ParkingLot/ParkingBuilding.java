package ParkingLot;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingBuilding {
    private List<ParkingLevel> levels;

    public ParkingBuilding(List<ParkingLevel> levels) {
        this.levels = levels;
    }

    public Ticket allocate(Vehicle vehicle){
        System.out.println("Allocating Vehicle"+ vehicle.getVehicleNumber());
        for(ParkingLevel level:levels){
            if(level.hasAvailability(vehicle.getVehicleType())){
                ParkingSpot spot = level.park(vehicle.getVehicleType());
                return new Ticket(vehicle,level,spot, LocalDateTime.now());
            }
        }
        return null;
    }

    public void release(Ticket ticket){
        System.out.println("Releasing Vehicle"+ ticket.vehicle.getVehicleNumber());
        ticket.level.unPark(ticket.vehicle.getVehicleType(),ticket.spot);
    }

}
