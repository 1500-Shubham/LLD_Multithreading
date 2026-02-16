package RideSharing.V2;

public class StandardFareStrategy implements FareStrategy{
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFareKM() * distance * 1.0;
    }
}
