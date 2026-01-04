package Problems.ParkingLot;

import java.util.List;

public class ParkingFloor {
    List<ParkingSpots> parkingSpots;
    String FloorNumber;
    ParkingFloor(){

    }
    void addSpots(ParkingSpots p){
        parkingSpots.add(p);
    }
}
