package ParkingLot;

public class ParkingSpot {
    public String spotId;
    public boolean isFree;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isFree = true;
    }

    public void occupySpot(){
        this.isFree = false;
    }
    public  void releaseSpot(){
        this.isFree= true;
    }

    public boolean isSpotFree(){
        return this.isFree;
    }
}
