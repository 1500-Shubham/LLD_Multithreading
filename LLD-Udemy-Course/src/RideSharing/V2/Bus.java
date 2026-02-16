package RideSharing.V2;

public class Bus extends Vehicle{
    public Bus(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public double getFareKM() {
        return 20;
    }
}
