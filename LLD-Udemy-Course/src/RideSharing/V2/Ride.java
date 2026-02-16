package RideSharing.V2;

// A Single ride
public class Ride {
    private  Passenger passenger;
    private Driver driver;
    private double distance;
    private FareStrategy fareStrategy;
    private RideStatus rideStatus;
    private double fare;
    public Ride(Passenger passenger, Driver driver, double distance, FareStrategy fareStrategy) {
        this.passenger = passenger;
        this.driver = driver;
        this.distance = distance;
        this.fareStrategy = fareStrategy;
        this.rideStatus = RideStatus.SCHEDULED; //firsst time Ride start
    }

    public void calculateFare(){
        this.fare = fareStrategy.calcFare(this.driver.getVehicle(), this.distance);
    }

    public void updateStatus(RideStatus rideStatus){
        this.rideStatus = rideStatus;
        notifyUsers(rideStatus);
    }

    private void notifyUsers(RideStatus rideStatus){
        passenger.notify("Ride Changed to " + rideStatus);
        driver.notify("Ride Changed to " + rideStatus);
    }

    public double getFare(){
        return this.fare;
    }



}
