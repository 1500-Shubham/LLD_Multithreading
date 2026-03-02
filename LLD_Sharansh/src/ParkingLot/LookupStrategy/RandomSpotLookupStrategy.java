package ParkingLot.LookupStrategy;

import ParkingLot.ParkingSpot;

import java.util.List;

public class RandomSpotLookupStrategy implements ParkingSpotLookupStrategy{
    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> spots) {
        for(ParkingSpot p : spots){
            if(p.isSpotFree()){
                return p;
            }
        }
        return null;
    }
}
