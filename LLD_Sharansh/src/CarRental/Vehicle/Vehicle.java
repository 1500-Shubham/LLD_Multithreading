package CarRental.Vehicle;
import CarRental.enums.VehicleType;
import CarRental.enums.VehicleStatus;

public class Vehicle {
    //just a pojo class
    int vehicleId;
    String vehicleNumber;
    VehicleType vehicleType;
    double dailyRentCost;
    VehicleStatus vehicleStatus;

    public Vehicle(int vehicleId, String vehicleNumber, VehicleType vehicleType, double dailyRentCost) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.dailyRentCost = dailyRentCost;
        this.vehicleStatus = VehicleStatus.AVAILABLE; //default
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getDailyRentCost() {
        return dailyRentCost;
    }

    public void setDailyRentCost(double dailyRentCost) {
        this.dailyRentCost = dailyRentCost;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}