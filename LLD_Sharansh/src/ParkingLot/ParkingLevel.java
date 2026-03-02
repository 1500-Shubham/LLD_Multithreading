package ParkingLot;

import ParkingLot.Enums.VehicleType;
import ParkingLot.SpotManagers.ParkingSpotManager;

import java.util.Map;

public class ParkingLevel {
    private int levelNumber;
    private Map<VehicleType, ParkingSpotManager> managers;

    public ParkingLevel(int levelNumber, Map<VehicleType, ParkingSpotManager> managers) {
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailability(VehicleType type){
        return this.managers.get(type).hasFreeSpot();
    }

    public ParkingSpot park(VehicleType type){
        return this.managers.get(type).park();
    }

    public void unPark(VehicleType type,ParkingSpot spot){
        this.managers.get(type).unpark(spot);
    }


}
