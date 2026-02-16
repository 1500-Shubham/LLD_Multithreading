package RideSharing.V2;

public class SharedFareStrategy implements FareStrategy{
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFareKM() * distance * 0.5;
    }
}
