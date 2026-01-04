package Problems.ParkingLot;

public class Ticket {
Integer entryHour;
Vehicle vehicle;
ParkingSpots parkingSpots;
Ticket(Integer entryHour,Vehicle vehicle,ParkingSpots parkingSpots){
    this.entryHour=entryHour;
    this.vehicle=vehicle;
    this.parkingSpots = parkingSpots;
}

}
