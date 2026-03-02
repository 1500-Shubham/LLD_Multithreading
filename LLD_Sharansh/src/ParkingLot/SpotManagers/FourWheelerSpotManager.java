package ParkingLot.SpotManagers;

import ParkingLot.LookupStrategy.ParkingSpotLookupStrategy;
import ParkingLot.ParkingSpot;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class FourWheelerSpotManager extends ParkingSpotManager {
    private List<ParkingSpot> spots;
    private ParkingSpotLookupStrategy strategy;
    private ReentrantLock lock;

    public FourWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        this.spots = spots;
        this.strategy = strategy;
    }

    @Override
    public ParkingSpot park() {
        lock.lock();
        ParkingSpot fourWheelerSpot = this.strategy.selectSpot(this.spots);
        fourWheelerSpot.occupySpot();
        System.out.println("SPOT occupied by fourWheeler" + fourWheelerSpot.spotId);
        lock.unlock();
        return fourWheelerSpot;
    }

    @Override
    public void unpark(ParkingSpot spot) {
        lock.lock();
        spot.releaseSpot();
        System.out.println("SPOT released by FourWheeler" + spot.spotId);
        lock.unlock();
    }

    @Override
    public boolean hasFreeSpot() {
        for(ParkingSpot p:spots){
            if(p.isSpotFree()) return true;
        }
        return false;
    }
}
