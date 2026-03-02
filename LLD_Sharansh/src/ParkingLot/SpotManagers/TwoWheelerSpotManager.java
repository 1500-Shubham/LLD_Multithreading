package ParkingLot.SpotManagers;

import ParkingLot.LookupStrategy.ParkingSpotLookupStrategy;
import ParkingLot.ParkingSpot;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class TwoWheelerSpotManager extends ParkingSpotManager {
    private List<ParkingSpot> spots;
    private ParkingSpotLookupStrategy strategy;
    private ReentrantLock lock;

    public TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        this.spots = spots;
        this.strategy = strategy;
        this.lock = new ReentrantLock();
    }

    @Override
    public ParkingSpot park() {
        lock.lock();
        ParkingSpot twoWheelerSpot = this.strategy.selectSpot(this.spots);
        twoWheelerSpot.occupySpot();
        System.out.println("SPOT occupied by TwoWheeler" + twoWheelerSpot.spotId);
        lock.unlock();
        return twoWheelerSpot;
    }

    @Override
    public void unpark(ParkingSpot spot) {
    lock.lock();
    spot.releaseSpot();
    System.out.println("SPOT released by TwoWheeler" + spot.spotId);
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
