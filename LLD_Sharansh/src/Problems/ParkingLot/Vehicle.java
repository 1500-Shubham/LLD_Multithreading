package Problems.ParkingLot;

enum VehicleType{
     TWOWheeler,FOURWheeler
}

abstract class Vehicle{
    String vehiclenumber;
    VehicleType type;

    Vehicle(String number, VehicleType type){
        this.vehiclenumber=number;
        this.type=type;
    }
}

class TwoWheeler extends Vehicle{
    TwoWheeler(String number, VehicleType type){
        super(number,type);
    }
}

class FourWheeler extends Vehicle{
    FourWheeler(String number, VehicleType type){
        super(number,type);
    }
}