package RideSharing.V2;

public abstract class Vehicle {

    private String numberPlate;
    public  abstract  double getFareKM();

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
