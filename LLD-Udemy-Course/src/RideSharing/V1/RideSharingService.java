package RideSharing.V1;

import java.util.ArrayList;
import java.util.List;

public class RideSharingService {
    private List<Passenger> passengerList;
    private List<Driver> driverList;

    public RideSharingService() {
        this.passengerList = new ArrayList<>();
        this.driverList = new ArrayList<>();
    }

    public  void addDrivers(Driver driver){
        this.driverList.add(driver);
    }

    public void addPassenger(Passenger passenger){
        this.passengerList.add(passenger);
    }

    public void bookRide(Passenger passenger, double distanceToGo){
        Driver markedDriver= null;
        double mini = Integer.MAX_VALUE;
        for(Driver d : driverList){
            double temp=calDistance(d.getLocation(),passenger.getLocation());
            if(temp < mini){
                mini=temp;
                markedDriver = d;
            }
        }
        System.out.println("Driver for this passenger"+ passenger.getName()+" is "+ markedDriver.getName());
        System.out.println("Vehicle type is "+markedDriver.getVehicle().getType());
        System.out.println("Calculate Fare for "+distanceToGo+" km is"+calFare(markedDriver.getVehicle(),distanceToGo));

    }
    private double calFare(Vehicle vehicle, double distance){
        if(vehicle.getType()=="Car"){
            return 10*distance;
        }
        else return 20*distance;
        //        Open close violate
    }

    private double calDistance(Location one,Location two){
//        Any algo will work
        return Math.abs((one.getLatitute()- two.getLatitute())*(one.getLongitude()- two.getLongitude()));
    }

}
