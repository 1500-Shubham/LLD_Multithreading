package RideSharing.V1;

public class Vehicle {
    private String numberPlate;
    private String type;

    public Vehicle(String numberPlate, String type) {
        this.numberPlate = numberPlate;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
