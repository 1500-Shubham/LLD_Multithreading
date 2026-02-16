package RideSharing.V1;

public class Main {
    public static void main(String[] args) {
       Vehicle swift = new Vehicle("SWIFT","Car");
        Vehicle mercedes = new Vehicle("MERCEDES","Bus");
        Location firstLocation= new Location(1,1);
        Location secondLocation = new Location(4,5);
        Location thirdLocation = new Location(2,5);
        Driver d1= new Driver("Shubham",swift,firstLocation);
        Driver d2 = new Driver("Satyam",mercedes,secondLocation);

        Passenger p1 = new Passenger(thirdLocation,"Golu");
        RideSharingService rideSharingService = new RideSharingService();
        rideSharingService.addDrivers(d1);
        rideSharingService.addDrivers(d2);
        rideSharingService.addPassenger(p1);

        rideSharingService.bookRide(p1,20);
    }
}
