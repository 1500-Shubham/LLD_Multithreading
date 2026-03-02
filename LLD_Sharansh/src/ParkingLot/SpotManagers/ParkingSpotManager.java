package ParkingLot.SpotManagers;

import ParkingLot.ParkingSpot;

public abstract class ParkingSpotManager {
    public abstract ParkingSpot park();
    public abstract void unpark(ParkingSpot spot);
    public abstract boolean hasFreeSpot();
}
