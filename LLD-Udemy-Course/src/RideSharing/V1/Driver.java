package RideSharing.V1;

public class Driver {
private  String name;
private  Vehicle vehicle;
private Location location;

    public Driver(String name, Vehicle vehicle, Location location) {
        this.name = name;
        this.vehicle = vehicle;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
