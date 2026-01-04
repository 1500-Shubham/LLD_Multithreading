package Problems.ParkingLot;

enum ParkingSpotType{
    TwoWheeler, FourWheeler
}

public class ParkingSpots {
    String spotNumber;
    ParkingSpotType parkingSpotType;
    boolean isAvailable;
    ParkingSpots(ParkingSpotType parkingSpotType){
        this.parkingSpotType=parkingSpotType;
    }

}
