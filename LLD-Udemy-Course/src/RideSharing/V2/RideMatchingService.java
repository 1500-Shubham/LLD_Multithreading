package RideSharing.V2;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingService {
    private List<Driver> availableDrivers;

    public RideMatchingService() {
        this.availableDrivers = new ArrayList<>();
    }

    public  void addDriver(Driver driver){
        availableDrivers.add(driver);
    }

    public  void requestRide(Passenger passenger,double distance, FareStrategy fareStrategy){
        Driver driver = findNearestDriver(passenger.getLocation());
        passenger.notify("Your Driver is  "+ driver.getName() + "your vehicle is " +driver.getVehicle().getNumberPlate());
        // Create Ride
        Ride ride = new Ride(passenger,driver,distance,fareStrategy);
        // ride scheduled
        ride.updateStatus(RideStatus.SCHEDULED);

        ride.calculateFare();
        passenger.notify("Ride fare is "+ ride.getFare());
        driver.notify("Driver fare is "+ ride.getFare());

        ride.updateStatus(RideStatus.ONGOING);

        ride.updateStatus(RideStatus.COMPLETED);


    }


    private Driver findNearestDriver(Location passengerLocation){
        Driver d =null;
        double dis = Integer.MAX_VALUE;
        for(Driver driver : availableDrivers){
            double temp = driver.getLocation().calDistance(passengerLocation);
            if(dis > temp){
                dis = temp;
                d=driver;
            }
        }

        return d;
    }

}
